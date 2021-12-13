package com.j2se.game;
/**
 * 乌龟线程子任务
 * @author Administrator
 *
 */
public class TrotoriseTask implements Runnable {
	private int initStep = 0;  //初始步数
	private int totalStep = 10; //总的步数

	@Override
	public void run() {
		while(this.initStep < this.totalStep){
			this.initStep++;
			System.out.println(Thread.currentThread().getName()+"跑了"+this.initStep+"步");
		}
	}

}
