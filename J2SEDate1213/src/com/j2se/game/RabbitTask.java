package com.j2se.game;

import java.util.Random;

/**
 * �����߳�������
 * @author Administrator
 *
 */
public class RabbitTask implements Runnable {

	private int initStep = 0;  //��ʼ����
	private int totalStep = 10; //�ܵĲ���
	
	private Random r = new Random();   //�������
	
	private boolean[] data = {true,false}; 
	
	@Override
	public void run() {
		while(this.initStep < this.totalStep){
			int ret = r.nextInt(2);
			if(data[ret]){
				this.initStep += 2;
				System.out.println(Thread.currentThread().getName()+"����"+ this.initStep+"��");
			}else{
				System.out.println(Thread.currentThread().getName()+"������Ϣzzzzzzzzz");
			}
			
		}
	}

}
