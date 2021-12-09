package com.j2se.runable;
/**
 * 乌龟类
 * 每次跑一步
 * 不会偷懒
 * @author Administrator
 *
 */
public class TortoiseTask implements Runnable {
	//起始步数
	private int initStep = 0;
	//终点步数
	private int endStep = 10;
	@Override
	public void run() {
		while(this.initStep < this.endStep) {
			this.initStep++;
			System.out.println("乌龟跑了"+this.initStep+"步");
		}
	}

}
