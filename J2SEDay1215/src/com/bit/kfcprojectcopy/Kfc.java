package com.bit.kfcprojectcopy;
/**
 * KFC测试类
 * @author 19833
 *
 */
public class Kfc {
	public static void main(String[] args) {
		//创建共享资源
		Cleck cleck = new Cleck();
		//创建顾客和用户
		Product product = new Product(cleck);
		User user = new User(cleck);
		//将顾客和用户注入到Thread中
		Thread t1 = new Thread(product,"厨师");
		Thread t2 = new Thread(user,"顾客");
		//启动线程
		t1.start();
		t2.start();
	}
}
