package com.j2se.bridge;
/**
 * 共享资源
 * 长江大桥
 * @author Administrator
 * 共享资源使用 synchronized 关键字修饰，表示这是线程安全的(每次只能允许一个子任务使用该共享资源)
 *
 */
public class Bridge {

	//模拟动车过桥
	public synchronized void DongChe(){
		System.out.println("动车开始过桥start...,大约需要5秒");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("动车成功过桥end...");
	}
	
	//模拟高铁过桥
	public synchronized void GaoTie(){
		System.out.println("高铁开始过桥start...,大约需要3秒");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("高铁成功过桥end...");
	}
}
