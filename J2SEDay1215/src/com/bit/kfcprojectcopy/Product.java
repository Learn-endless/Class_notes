package com.bit.kfcprojectcopy;
/**
 * ��ʦ������
 * @author Administrator
 *
 */
public class Product implements Runnable {
	//������
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
			System.out.println("�����ʧ����");
			e.printStackTrace();
		}
	}

}
