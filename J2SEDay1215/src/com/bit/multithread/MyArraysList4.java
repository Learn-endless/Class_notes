package com.bit.multithread;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
//��д��
public class MyArraysList4<T> {
	private Object[] elementDate;
	private int sizeNumber;
	/**
	 * ��д��
	 * ������������Դ���ݲ��ᷢ���ı�ʱʹ��
	 * д����������Դ���ݾ��������ı�ʱʹ��
	 * 
	 * �����������Դ���Զ���߳�ͬʱ����
	 * д���������Դֻ�������̷߳���
	 */
	private ReadWriteLock lock = new ReadWriteLock() {
		
		@Override
		public Lock writeLock() {
			// TODO �Զ����ɵķ������
			return null;
		}
		
		@Override
		public Lock readLock() {
			// TODO �Զ����ɵķ������
			return null;
		}
	};
	
	//�޲ι���
	public MyArraysList4() {
		this.elementDate = new Object[10];
	}
	//�вι���
	public MyArraysList4(int lenth) {
		this.elementDate = new Object[lenth];
	}
	//��ȡԪ�ظ���
	public int getSize() {
		lock.readLock().lock(); //�϶���
		try {
			return this.sizeNumber;
		}finally {
			lock.readLock().unlock(); //�⿪����
		}
	}
	//�����±���Ԫ��
	@SuppressWarnings("unchecked")
	public <E> E getIndex(int index) {
		return (E) this.elementDate[index];
	}
	//���Ԫ��
	public <E> void add(E date) {
		//��try�����������finally�������
		lock.writeLock().lock();;   //ʹ�õ�д����������������try���棩
		try {
			if(this.elementDate.length == sizeNumber) {
				int newLenth = this.sizeNumber + (this.sizeNumber >> 1);
				this.elementDate = Arrays.copyOf(this.elementDate, newLenth);
			}
			this.elementDate[sizeNumber] = date;
			this.sizeNumber++;
		}finally {
			lock.writeLock().unlock();; //ʹ�õ�д����������������finally���棩
		}
	}
}
