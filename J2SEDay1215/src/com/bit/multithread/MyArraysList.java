package com.bit.multithread;

import java.util.Arrays;

public class MyArraysList<T> {
	private Object[] elementDate;
	private int sizeNumber;
	//无参构造
	public MyArraysList() {
		this.elementDate = new Object[10];
	}
	//有参构造
	public MyArraysList(int lenth) {
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
		synchronized (this) {
			if(this.elementDate.length == sizeNumber) {
				int newLenth = this.sizeNumber + (this.sizeNumber >> 1);
				this.elementDate = Arrays.copyOf(this.elementDate, newLenth);
			}
			this.elementDate[sizeNumber] = date;
			this.sizeNumber++;
		}
	}
}
