package com.j2se.runable;
/**
 * 龟兔赛跑游戏
 * @author Administrator
 *
 */
public class PlayGame {

	public static void main(String[] args) {
//		//创建乌龟类和兔子类
//		RabbitTask r1 = new RabbitTask();
//		TortoiseTask t1 = new TortoiseTask();
//		//注入到Thread中
//		Thread n1 = new Thread(r1);
//		Thread n2 = new Thread(t1);
//		//启动多线程
//		n1.start();
//		n2.start();
		
		new Thread(new RabbitTask()).start();
		new Thread(new TortoiseTask()).start();
	}

}
