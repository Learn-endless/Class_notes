package com.bit.kfcprojectcopy;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 共享资源
 * KFC的店员
 * @author Administrator
 *
 */
public class Cleck {
	private int tmp = -1;  //用来表示当前店员手里有没有面包
	
	private Lock lock = new ReentrantLock(true);
	/**
	 * 使用重入锁代替synchronized完成多线程之间的协作
	 */
	private Condition condition = lock.newCondition();
	
	//厨师使用的方法，烤面包
	public void setProduct(int date) throws InterruptedException {
		//上锁
		lock.lock();
		try {
			//判断店员手里有没有面包
			if(this.tmp != -1) {
				//有面包，说明顾客还没来，等待
				condition.await();            //等价于this.wait()换汤不换药
			}
			this.tmp = date; //生产面包
			
			condition.signalAll(); //通知顾客，共享锁  等价于this.notifyAll();
			
			System.out.println("厨师烤好了第》》"+date+"个面包");
		}finally {
			lock.unlock();  //解锁     
		}
	}
	
	//顾客使用的方法
	public void getProduct(int date) throws InterruptedException {
		lock.lock();
		try {
			if(this.tmp == -1) {
				condition.await();
			}
			//顾客拿走面包
			int ret = this.tmp;
			
			//店员手里面空了
			this.tmp = -1;
			
			condition.signalAll(); //共享锁
			
			System.out.println("顾客拿走了第》》"+date+"个面包");
			
		}finally {
			lock.unlock();
		}
	}
}
