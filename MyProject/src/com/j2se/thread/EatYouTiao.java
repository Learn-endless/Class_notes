package com.j2se.thread;
/**
 * ��������
 * @author Administrator
 *
 */
public class EatYouTiao extends Thread{
	
	//ע�ⲻҪ��дstart����
//	@Override
//	public synchronized void start() {
//		// TODO �Զ����ɵķ������
//		System.out.println("������");
//	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < 100; i++) {
			System.out.println("���˵�"+i+"������");
		}
	}

}
