package com.j2se.threadsleeptest;
/**
 * �̵߳�����
 * Thread.sleep(long time) ��λ������
 * @author Administrator
 *
 */
public class ThreadSleepTest {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try{
					for (int i = 1; i <= 10; i++) {
						if(i == 5){
						//sleep�������׳�һ���쳣��InterruptedException
							Thread.sleep(5000);   //5000���� 
					    }
						System.out.println(Thread.currentThread().getName()+":"+i);
				    }
			  }catch(Exception e){
				  e.printStackTrace();
			  }
			}
		},"�����߳�").start();
	}
}
