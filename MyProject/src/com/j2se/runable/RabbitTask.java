package com.j2se.runable;

import java.util.Random;
/**
 * ������
 * ÿ��������
 * ���ܻ�͵��
 * @author Administrator
 *
 */
public class RabbitTask implements Runnable {
	//��ʼ����
	private int initStep = 0;
	//�յ㲽��
	private int endStep = 10;
	//�������
	boolean[] ret = {true,false};
	
	Random r = new Random();
	@Override
	public void run() {
		while(this.initStep < this.endStep) {
			//����0-1���������
			int tmp = r.nextInt(2);
			//Ϊ���ܲ���Ϊ����Ϣ
			if(ret[tmp]) {
				this.initStep+=2;
				System.out.println("��������"+this.initStep+"��");	
			}else {
				System.out.println("��������͵��zzzzzzzzzz");
			}

		}
	}
}
