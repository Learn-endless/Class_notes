package com.bit.multithread;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class MyArraysList3<T> {
	private Object[] elementDate;
	private int sizeNumber;
	
	//���򼶱����������Ա�����ֶ�������JDK1.5֮��
	//����ʹ���вι��췽�����½�һ������true��ʾ��һ����ƽ�����ȴ�ʱ���������ִ��
	private ReentrantLock lock = new ReentrantLock(true);
	
	//�޲ι���
	public MyArraysList3() {
		this.elementDate = new Object[10];
	}
	//�вι���
	public MyArraysList3(int lenth) {
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
		//��try�����������finally�������
		lock.lock();   //������������try���棩
		try {
			if(this.elementDate.length == sizeNumber) {
				int newLenth = this.sizeNumber + (this.sizeNumber >> 1);
				this.elementDate = Arrays.copyOf(this.elementDate, newLenth);
			}
			this.elementDate[sizeNumber] = date;
			this.sizeNumber++;
		}finally {
			lock.unlock(); //������������finally���棩
		}
	}
}
