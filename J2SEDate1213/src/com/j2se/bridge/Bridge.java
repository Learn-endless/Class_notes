package com.j2se.bridge;
/**
 * ������Դ
 * ��������
 * @author Administrator
 * ������Դʹ�� synchronized �ؼ������Σ���ʾ�����̰߳�ȫ��(ÿ��ֻ������һ��������ʹ�øù�����Դ)
 *
 */
public class Bridge {

	//ģ�⶯������
	public synchronized void DongChe(){
		System.out.println("������ʼ����start...,��Լ��Ҫ5��");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����ɹ�����end...");
	}
	
	//ģ���������
	public synchronized void GaoTie(){
		System.out.println("������ʼ����start...,��Լ��Ҫ3��");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����ɹ�����end...");
	}
}
