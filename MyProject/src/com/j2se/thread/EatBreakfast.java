package com.j2se.thread;
/**
 * 多线程测试类
 * 吃油条
 * 吃包子
 * @author Administrator
 *
 */
public class EatBreakfast {
	public static void main(String[] args) {
		EatBaoZi c1 = new EatBaoZi();
		EatYouTiao c2 = new EatYouTiao();
		//注意这里start方法我们需要调用的是父类的方法
		//如果在子类中重写了start方法，那么就无法调用run方法
		c1.start();
		c2.start();
		// run()方法启动线程不会达到并发的效果，只是单线程串行执行程序
		c1.run();
		c2.run();
	}
}
