package com.j2se.thread;
/**
 * ���̲߳�����
 * ������
 * �԰���
 * @author Administrator
 *
 */
public class EatBreakfast {
	public static void main(String[] args) {
		EatBaoZi c1 = new EatBaoZi();
		EatYouTiao c2 = new EatYouTiao();
		//ע������start����������Ҫ���õ��Ǹ���ķ���
		//�������������д��start��������ô���޷�����run����
		c1.start();
		c2.start();
		// run()���������̲߳���ﵽ������Ч����ֻ�ǵ��̴߳���ִ�г���
		c1.run();
		c2.run();
	}
}
