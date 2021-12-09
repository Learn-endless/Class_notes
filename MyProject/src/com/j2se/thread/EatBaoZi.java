package com.j2se.thread;
//吃包子
public class EatBaoZi extends Thread{
	//注意不要重写start方法
//	@Override
//	public synchronized void start() {
//		// TODO 自动生成的方法存根
//		System.out.println("吃包子");
//	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("吃早餐线程：吃了第"+i+"个包子");
		}
	}
}
