package com.bit.multithread;

//���Թ�ƽ��
public class MyArraysListTest3 {
	public static void main(String[] args) {
		MyArraysList3<Integer> t = new MyArraysList3<Integer>();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					t.add(123);
				}
			}
		},"�߳�һ").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					t.add(123);
				}
			}
		},"�߳�һ").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					t.add(123);
				}
			}
		},"�߳�һ").start();
	}
}
