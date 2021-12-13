package com.j2se.game;
/**
 * 龟兔赛跑
 * 线程优先级最高，最有可能先执行完毕
 * 10：最高优先级(MAX_PRIORITY)
 * 5：普通优先级 (NORM_PRIORITY)
 * 1：最低优先级 (MIN_PRIORITY)
 * @author Administrator
 *
 * 线程的合入,使用join方法
 */
public class PlayGame {
	public static void main(String[] args) {
		System.out.println("main start");
		RabbitTask r1 =new RabbitTask();
		TrotoriseTask r2 =new TrotoriseTask();
		Thread t2 = new Thread(r2, "乌龟线程...");
		Thread t1 = new Thread(r1, "兔子线程...");
		
		
		//设置优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		//启动线程
		t1.start();
		t2.start();
		
		//线程合入
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");

	}
}
