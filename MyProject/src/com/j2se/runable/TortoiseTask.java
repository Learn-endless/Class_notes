package com.j2se.runable;
/**
 * �ڹ���
 * ÿ����һ��
 * ����͵��
 * @author Administrator
 *
 */
public class TortoiseTask implements Runnable {
	//��ʼ����
	private int initStep = 0;
	//�յ㲽��
	private int endStep = 10;
	@Override
	public void run() {
		while(this.initStep < this.endStep) {
			this.initStep++;
			System.out.println("�ڹ�����"+this.initStep+"��");
		}
	}

}
