package com.bit.kfcproject;

public class Kfc {
	public static void main(String[] args) {
		Cleck cleck = new Cleck();
		
		Product product = new Product(cleck);
		User user = new User(cleck);
		
		Thread t1 = new Thread(product,"��ʦ");
		Thread t2 = new Thread(user,"�˿�");
		
		t1.start();
		t2.start();
	}
}
