package com.j2se.game;
/**
 * �ڹ��߳�������
 * @author Administrator
 *
 */
public class TrotoriseTask implements Runnable {
	private int initStep = 0;  //��ʼ����
	private int totalStep = 10; //�ܵĲ���

	@Override
	public void run() {
		while(this.initStep < this.totalStep){
			this.initStep++;
			System.out.println(Thread.currentThread().getName()+"����"+this.initStep+"��");
		}
	}

}
