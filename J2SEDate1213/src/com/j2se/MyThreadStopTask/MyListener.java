package com.j2se.MyThreadStopTask;

import java.util.TimerTask;
import java.io.File;
import java.util.Timer;

/**
 * �Զ���ļ������������̵߳�����
 * ���裺
 * 1 �����̣߳�ִ��MyTask������
 * 2 ������ʱ����Ͷ�ʱ��
 * 3 ÿ��1000�����жϴ�������û��stop�ļ�������о�ֹͣ�̵߳�ִ��
 * @author Administrator
 *
 */
public class MyListener {
	public static void main(String[] args) {
		final MyStopTask n1 = new MyStopTask(true);
		Thread t1 = new Thread(n1);
		t1.start();
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				File file = new File("stop.txt");
				//exists�����ж��Ƿ����stop.txt�ļ�������Ϊtrue������false
				if(file.exists()){
					n1.setFlag(false);  //���������flagֵΪfalse
					file.delete();      //ɾ��stop.txt�ļ�
					timer.cancel();     //ֹͣ��ʱ��
				}
			}
		}, 1000, 1000);
		
	}
}
