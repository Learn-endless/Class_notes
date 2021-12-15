package com.bit.multithread;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
//读写锁
public class MyArraysList4<T> {
	private Object[] elementDate;
	private int sizeNumber;
	/**
	 * 读写锁
	 * 读锁：共享资源数据不会发生改变时使用
	 * 写锁：共享资源数据经常发生改变时使用
	 * 
	 * 读锁里面的资源可以多个线程同时访问
	 * 写锁里面的资源只能允许单线程访问
	 */
	private ReadWriteLock lock = new ReadWriteLock() {
		
		@Override
		public Lock writeLock() {
			// TODO 自动生成的方法存根
			return null;
		}
		
		@Override
		public Lock readLock() {
			// TODO 自动生成的方法存根
			return null;
		}
	};
	
	//无参构造
	public MyArraysList4() {
		this.elementDate = new Object[10];
	}
	//有参构造
	public MyArraysList4(int lenth) {
		this.elementDate = new Object[lenth];
	}
	//获取元素个数
	public int getSize() {
		lock.readLock().lock(); //上读锁
		try {
			return this.sizeNumber;
		}finally {
			lock.readLock().unlock(); //解开读锁
		}
	}
	//根据下标找元素
	@SuppressWarnings("unchecked")
	public <E> E getIndex(int index) {
		return (E) this.elementDate[index];
	}
	//添加元素
	public <E> void add(E date) {
		//在try里面加锁，在finally里面解锁
		lock.writeLock().lock();;   //使用的写锁：上锁（必须在try外面）
		try {
			if(this.elementDate.length == sizeNumber) {
				int newLenth = this.sizeNumber + (this.sizeNumber >> 1);
				this.elementDate = Arrays.copyOf(this.elementDate, newLenth);
			}
			this.elementDate[sizeNumber] = date;
			this.sizeNumber++;
		}finally {
			lock.writeLock().unlock();; //使用的写锁：解锁（必须在finally里面）
		}
	}
}
