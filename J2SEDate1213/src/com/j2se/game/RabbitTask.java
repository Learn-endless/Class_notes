package com.j2se.game;

import java.util.Random;

/**
 * 兔子线程子任务
 * @author Administrator
 *
 */
public class RabbitTask implements Runnable {

	private int initStep = 0;  //初始步数
	private int totalStep = 10; //总的步数
	
	private Random r = new Random();   //随机对象
	
	private boolean[] data = {true,false}; 
	
	@Override
	public void run() {
		while(this.initStep < this.totalStep){
			int ret = r.nextInt(2);
			if(data[ret]){
				this.initStep += 2;
				System.out.println(Thread.currentThread().getName()+"跑了"+ this.initStep+"步");
			}else{
				System.out.println(Thread.currentThread().getName()+"正在休息zzzzzzzzz");
			}
			
		}
	}

}
