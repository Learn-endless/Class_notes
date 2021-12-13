package com.j2se.threadsleeptest;
/**
 * 线程的休眠
 * Thread.sleep(long time) 单位：毫秒
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
						//sleep方法会抛出一个异常：InterruptedException
							Thread.sleep(5000);   //5000毫秒 
					    }
						System.out.println(Thread.currentThread().getName()+":"+i);
				    }
			  }catch(Exception e){
				  e.printStackTrace();
			  }
			}
		},"休眠线程").start();
	}
}
