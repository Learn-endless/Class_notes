package com.j2se.runable;
/**
 * ����������Ϸ
 * @author Administrator
 *
 */
public class PlayGame {

	public static void main(String[] args) {
//		//�����ڹ����������
//		RabbitTask r1 = new RabbitTask();
//		TortoiseTask t1 = new TortoiseTask();
//		//ע�뵽Thread��
//		Thread n1 = new Thread(r1);
//		Thread n2 = new Thread(t1);
//		//�������߳�
//		n1.start();
//		n2.start();
		
		new Thread(new RabbitTask()).start();
		new Thread(new TortoiseTask()).start();
	}

}
