package com.j2se.game;
/**
 * ��������
 * �߳����ȼ���ߣ����п�����ִ�����
 * 10��������ȼ�(MAX_PRIORITY)
 * 5����ͨ���ȼ� (NORM_PRIORITY)
 * 1��������ȼ� (MIN_PRIORITY)
 * @author Administrator
 *
 * �̵߳ĺ���,ʹ��join����
 */
public class PlayGame {
	public static void main(String[] args) {
		System.out.println("main start");
		RabbitTask r1 =new RabbitTask();
		TrotoriseTask r2 =new TrotoriseTask();
		Thread t2 = new Thread(r2, "�ڹ��߳�...");
		Thread t1 = new Thread(r1, "�����߳�...");
		
		
		//�������ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		//�����߳�
		t1.start();
		t2.start();
		
		//�̺߳���
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");

	}
}
