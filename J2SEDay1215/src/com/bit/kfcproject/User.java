package com.bit.kfcproject;

public class User implements Runnable {
	//存放面包
	private Cleck cleck;
	
	public User(Cleck cleck) {
		this.cleck = cleck;
	}
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 10;i++) {
				cleck.getProduct(i);
			}
		} catch (Exception e) {
			System.out.println("顾客没有拿到面包");
			e.printStackTrace();
		}
	}

}
