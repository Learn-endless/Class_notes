package com.j2se.runable;

public class Test {
	public static void main(String[] args) {
		new Thread(new Runnable() {			
			@Override
			public void run() {
				int i = 0;
				while(i++ < 200) {
					System.out.println("������"+i);
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				while(i++ < 200) {
					System.out.println("���㽶"+i);9++
				}
			}
		}).start();
	}
}
