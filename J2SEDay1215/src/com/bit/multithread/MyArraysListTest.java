package com.bit.multithread;
//测试JVM虚拟机自动的锁
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
