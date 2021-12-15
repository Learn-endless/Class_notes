package com.bit.kfcprojectcopy;
/**
 * 厨师任务类
 * @author Administrator
 *
 */
public class Product implements Runnable {
	//存放面包
	private Cleck cleck;
	
	public Product(Cleck cleck) {
		this.cleck = cleck;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 10 ; i++) {
				cleck.setProduct(i);
			}
		}catch(Exception e) {
			System.out.println("面包烤失败了");
			e.printStackTrace();
		}
	}

}
