package com.bit.kfcproject;
/**
 * 共享资源
 * KFC的店员
 * @author Administrator
 *
 */
public class Cleck {
	private int tmp = -1;  //用来表示当前店员手里有没有面包
	
	//厨师使用的方法，烤面包
	public void setProduct(int date) throws InterruptedException {
		//配合锁使用
		synchronized (this) {
			//判断店员手里有没有面包
			if(this.tmp != -1) {
				//有面包，说明顾客还没来，等待
				this.wait();
			}
			this.tmp = date; //生产面包
			
			this.notifyAll(); //通知顾客，共享锁
			
			System.out.println("厨师烤好了第"+date+"个面包");
			
		}
	}
	
	//顾客使用的方法
	public void getProduct(int date) throws InterruptedException {
		synchronized (this) {
			if(this.tmp == -1) {
				this.wait();
			}
			//顾客拿走面包
			int ret = this.tmp;
			
			//店员手里面空了
			this.tmp = -1;
			
			this.notifyAll(); //共享锁
			
			System.out.println("顾客拿走了第"+date+"个面包");
			
		}
	}
}
