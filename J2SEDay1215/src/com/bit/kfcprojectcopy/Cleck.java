package com.bit.kfcprojectcopy;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ������Դ
 * KFC�ĵ�Ա
 * @author Administrator
 *
 */
public class Cleck {
	private int tmp = -1;  //������ʾ��ǰ��Ա������û�����
	
	private Lock lock = new ReentrantLock(true);
	/**
	 * ʹ������������synchronized��ɶ��߳�֮���Э��
	 */
	private Condition condition = lock.newCondition();
	
	//��ʦʹ�õķ����������
	public void setProduct(int date) throws InterruptedException {
		//����
		lock.lock();
		try {
			//�жϵ�Ա������û�����
			if(this.tmp != -1) {
				//�������˵���˿ͻ�û�����ȴ�
				condition.await();            //�ȼ���this.wait()��������ҩ
			}
			this.tmp = date; //�������
			
			condition.signalAll(); //֪ͨ�˿ͣ�������  �ȼ���this.notifyAll();
			
			System.out.println("��ʦ�����˵ڡ���"+date+"�����");
		}finally {
			lock.unlock();  //����     
		}
	}
	
	//�˿�ʹ�õķ���
	public void getProduct(int date) throws InterruptedException {
		lock.lock();
		try {
			if(this.tmp == -1) {
				condition.await();
			}
			//�˿��������
			int ret = this.tmp;
			
			//��Ա���������
			this.tmp = -1;
			
			condition.signalAll(); //������
			
			System.out.println("�˿������˵ڡ���"+date+"�����");
			
		}finally {
			lock.unlock();
		}
	}
}
