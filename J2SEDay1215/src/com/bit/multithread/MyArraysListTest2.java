package com.bit.multithread;
//���Գ��򼶱����
public class MyArraysListTest2 {
	public static void main(String[] args) {
		MyArraysList2<Integer> t = new MyArraysList2<Integer>();
		
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
