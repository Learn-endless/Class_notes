package com.bit.multithread;

import java.util.Arrays;

public class MyArraysList<T> {
	private Object[] elementDate;
	private int sizeNumber;
	//�޲ι���
	public MyArraysList() {
		this.elementDate = new Object[10];
	}
	//�вι���
	public MyArraysList(int lenth) {
		this.elementDate = new Object[lenth];
	}
	//��ȡԪ�ظ���
	public int getSize() {
		return this.sizeNumber;
	}
	//�����±���Ԫ��
	@SuppressWarnings("unchecked")
	public <E> E getIndex(int index) {
		return (E) this.elementDate[index];
	}
	//���Ԫ��
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
