package com.j2se.timertasktest;

import java.util.Timer;

public class TestTimerTask {
	public static void main(String[] args) {
		MyTask t = new MyTask();
		
		Timer ret = new Timer();
		//����һ����ʱ�������
		//����������ʾ�ӳٶ೤ʱ��ִ��
		//����������ʱ�����ִ������
		ret.schedule(t, 1000, 5000);
	}
}
