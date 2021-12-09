package com.j2se.thread;
/**
 * 吃油条类
 * @author Administrator
 *
 */
public class EatYouTiao extends Thread{
	
	//注意不要重写start方法
//	@Override
//	public synchronized void start() {
//		// TODO 自动生成的方法存根
//		System.out.println("吃油条");
//	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i < 100; i++) {
			System.out.println("吃了第"+i+"根油条");
		}
	}

}
