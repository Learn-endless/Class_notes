package com.bit.multithread;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class MyArraysList3<T> {
	private Object[] elementDate;
	private int sizeNumber;
	
	//程序级别的锁，程序员可以手动上锁（JDK1.5之后）
	//这里使用有参构造方法来新建一个锁，true表示是一个公平锁，等待时间最长的优先执行
	private ReentrantLock lock = new ReentrantLock(true);
	
	//无参构造
	public MyArraysList3() {
		this.elementDate = new Object[10];
	}
	//有参构造
	public MyArraysList3(int lenth) {
		this.elementDate = new Object[lenth];
	}
	//获取元素个数
	public int getSize() {
		return this.sizeNumber;
	}
	//根据下标找元素
	@SuppressWarnings("unchecked")
	public <E> E getIndex(int index) {
		return (E) this.elementDate[index];
	}
	//添加元素
	public <E> void add(E date) {
		//在try里面加锁，在finally里面解锁
		lock.lock();   //上锁（必须在try外面）
		try {
			if(this.elementDate.length == sizeNumber) {
				int newLenth = this.sizeNumber + (this.sizeNumber >> 1);
				this.elementDate = Arrays.copyOf(this.elementDate, newLenth);
			}
			this.elementDate[sizeNumber] = date;
			this.sizeNumber++;
		}finally {
			lock.unlock(); //解锁（必须在finally里面）
		}
	}
}
