package com.bit.kfcproject;

public class User implements Runnable {
	//������
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
			System.out.println("�˿�û���õ����");
			e.printStackTrace();
		}
	}

}
