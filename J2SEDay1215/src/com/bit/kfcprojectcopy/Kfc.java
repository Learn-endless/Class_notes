package com.bit.kfcprojectcopy;
/**
 * KFC������
 * @author 19833
 *
 */
public class Kfc {
	public static void main(String[] args) {
		//����������Դ
		Cleck cleck = new Cleck();
		//�����˿ͺ��û�
		Product product = new Product(cleck);
		User user = new User(cleck);
		//���˿ͺ��û�ע�뵽Thread��
		Thread t1 = new Thread(product,"��ʦ");
		Thread t2 = new Thread(user,"�˿�");
		//�����߳�
		t1.start();
		t2.start();
	}
}
