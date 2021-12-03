package com.zretc.bookshop.ui;

import java.util.Arrays;
import java.util.Scanner;

import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;
import com.zretc.bookshop.service.impl.UserServiceImpl;

//ui��ͼ��
//���̿���+����ҵ�񷽷�(����ҵ���߼���ʵ����ķ���)
public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ҵ���߼���ʵ�ֵĶ���
		UserService user = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		//ϵͳִ������
		loop1:while(true) {
			System.out.println("****************************");
			System.out.println("****  ��ӭ����ͼ��ϵͳ  ****");
			System.out.println("**** 1.��¼ 2.�˳�ϵͳ  ****");
			System.out.println("****************************");
			System.out.print("��ѡ�񡷡���");
			int num = sc.nextInt();
			if(num == 1) {
				//��¼����
				loop2:while(true) {
					System.out.print("�������û�����");
					String userName = sc.next();
					System.out.print("���������룺");
					String userPwd = sc.next();
					
					//���÷���
					UserEntity user1 = user.login(userName, userPwd);
					
						if(user1 != null) {
							
							if(user1.getIdentity() == 1){
								System.out.println("=====================================hello ����Ա��=====================================");
							}else{
								System.out.println("=======================��ͨ�û���½�ɹ���=======================");
							}
							System.out.println("��ţ�"+user1.getUserId()+"�û�����"+user1.getUserName());
							int x = menu(user,user1);
							if(x == -2){
								break loop2;
							}else if(x == -1){
								break loop1;
							}
						}else {
							System.out.println("�û���������������������룡");
							break loop2;
						}
				}
			}else if(num == 2) {
				System.out.println("�˳�ϵͳ������");
				break;
			}else {
				System.out.println("ѡ���������������룡����");
				continue;
			}
		}
	}
	
	public static int menu(UserService user,UserEntity user1){
		Scanner sc = new Scanner(System.in);
		String[] admin_menu = {"1.�޸�����\t2.ע��\t3.�˳���½\t4.�˳�ϵͳ\t5.��ʾͼ����Ϣ\t6.��ʾ�û���Ϣ\t7.ɾ���û�"};
		String[] user_menu = {"1.�޸�����\t2.ע��\t3.�˳���½\t4.�˳�ϵͳ\t5.��ʾͼ����Ϣ"};
		while(true) {
			if(user1.getIdentity()==1){
				System.out.println(Arrays.toString(admin_menu));
			}else{
				System.out.println(Arrays.toString(user_menu));
			}
			System.out.print("��ѡ��");
			int ret = sc.nextInt();
			if(ret == 1) {
				//�޸�����
				System.out.print("�����������룺");
				String newP1 = sc.next();
				System.out.print("���ٴ����������룺");
				String newP2 = sc.next();
				
				boolean flag = user.updatePwd(user1,newP1,newP2);
				System.out.println(flag?"�޸ĳɹ�":"�޸�ʧ��");
				if(flag) {
					break;
				}
			}else if(ret == 2) {
				//ע��
				System.out.print("��������Ҫע����û�����");
				String name = sc.next();
				System.out.print("��������Ҫע������룺");
				String pwd = sc.next();
				boolean flag = user.userRegister(name, pwd);
				System.out.println(flag?"ע��ɹ�":"ע��ʧ��");
				if(flag) {
					break;
				}
			}else if(ret == 5){
				//��ʾ����ͼ����Ϣ
				user.bookDisplay();
			}else if(user1.getIdentity()==1&&ret == 6){
				//��ʾ�û���Ϣ
				user.display();
			}else if(ret == 3) {
				//�˳���½
				return -2;
			}else if(ret == 4) {
				//�˳�ϵͳ
				System.out.println("��ӭ�´ι���");
				return -1;
			}else if(user1.getIdentity()==1&&ret == 7){
				System.out.println("����������ɾ���û��ı�ţ�");
				int n = sc.nextInt();
				//ɾ���û�
				System.out.println(user.remove(n)?"ɾ���ɹ�����":"ɾ��ʧ�ܣ�");	
			}else {
				System.out.println("��������������룡");
			}
		}
		return 0;
	}

}
