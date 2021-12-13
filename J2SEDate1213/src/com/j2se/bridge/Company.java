package com.j2se.bridge;
/**
 * 公司类
 * 用来测试动车和高铁过桥
 * @author Administrator
 *
 */
public class Company {
	public static void main(String[] args) {
		//创建资源对象
		Bridge bridge = new Bridge();
		//创建子任务对象
		DongCheTask dong = new DongCheTask(bridge);
		GaoTieTask gao = new GaoTieTask(bridge);
		//将子任务对象注入Thread
		Thread t1 = new Thread(dong);
		Thread t2 = new Thread(gao);
		//启动线程
		t1.start();
		t2.start();
	}
}
