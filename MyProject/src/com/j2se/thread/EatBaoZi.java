package com.j2se.thread;
//�԰���
public class EatBaoZi extends Thread{
	//ע�ⲻҪ��дstart����
//	@Override
//	public synchronized void start() {
//		// TODO �Զ����ɵķ������
//		System.out.println("�԰���");
//	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("������̣߳����˵�"+i+"������");
		}
	}
}
