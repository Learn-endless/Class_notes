package com.j2se.bridge;
/**
 * ��˾��
 * �������Զ����͸�������
 * @author Administrator
 *
 */
public class Company {
	public static void main(String[] args) {
		//������Դ����
		Bridge bridge = new Bridge();
		//�������������
		DongCheTask dong = new DongCheTask(bridge);
		GaoTieTask gao = new GaoTieTask(bridge);
		//�����������ע��Thread
		Thread t1 = new Thread(dong);
		Thread t2 = new Thread(gao);
		//�����߳�
		t1.start();
		t2.start();
	}
}
