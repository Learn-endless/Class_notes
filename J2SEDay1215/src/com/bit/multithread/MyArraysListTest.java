package com.bit.multithread;
//����JVM������Զ�����
public class MyArraysListTest {
	public static void main(String[] args) {
		MyArraysList<Integer> t = new MyArraysList<Integer>();
		
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
