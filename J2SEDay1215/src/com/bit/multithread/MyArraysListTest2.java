package com.bit.multithread;
//测试程序级别的锁
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
		},"线程一").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					t.add(123);
				}
			}
		},"线程一").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					t.add(123);
				}
			}
		},"线程一").start();
	}
}
