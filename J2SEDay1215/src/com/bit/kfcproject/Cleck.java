package com.bit.kfcproject;
/**
 * ������Դ
 * KFC�ĵ�Ա
 * @author Administrator
 *
 */
public class Cleck {
	private int tmp = -1;  //������ʾ��ǰ��Ա������û�����
	
	//��ʦʹ�õķ����������
	public void setProduct(int date) throws InterruptedException {
		//�����ʹ��
		synchronized (this) {
			//�жϵ�Ա������û�����
			if(this.tmp != -1) {
				//�������˵���˿ͻ�û�����ȴ�
				this.wait();
			}
			this.tmp = date; //�������
			
			this.notifyAll(); //֪ͨ�˿ͣ�������
			
			System.out.println("��ʦ�����˵�"+date+"�����");
			
		}
	}
	
	//�˿�ʹ�õķ���
	public void getProduct(int date) throws InterruptedException {
		synchronized (this) {
			if(this.tmp == -1) {
				this.wait();
			}
			//�˿��������
			int ret = this.tmp;
			
			//��Ա���������
			this.tmp = -1;
			
			this.notifyAll(); //������
			
			System.out.println("�˿������˵�"+date+"�����");
			
		}
	}
}
