package com.j2se.runable;

import java.util.Random;
/**
 * 兔子类
 * 每次跑两步
 * 可能会偷懒
 * @author Administrator
 *
 */
public class RabbitTask implements Runnable {
	//初始步数
	private int initStep = 0;
	//终点步数
	private int endStep = 10;
	//随机数组
	boolean[] ret = {true,false};
	
	Random r = new Random();
	@Override
	public void run() {
		while(this.initStep < this.endStep) {
			//产生0-1的随机整数
			int tmp = r.nextInt(2);
			//为真跑步，为假休息
			if(ret[tmp]) {
				this.initStep+=2;
				System.out.println("兔子跑了"+this.initStep+"步");	
			}else {
				System.out.println("兔子正在偷懒zzzzzzzzzz");
			}

		}
	}
}
