package com.j2se.ui;

import java.util.Scanner;

import com.j2se.service.impl.UserServiceImpl;

public class FlowersTest {
	//�˵�
	public static void menu() {
		System.out.println("========�ʻ�����ϵͳ========");
		System.out.println("1.��ѯ���۶���");
		System.out.println("2.�޸����۶���");
		System.out.println("3.ɾ�����۶���");
		System.out.println("4.�˳�ϵͳ!");
		System.out.println("============================");
	}
	
	public static void main(String[] args) {
		UserServiceImpl user = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			System.out.println("�����롷��");
			int input = sc.nextInt();
			if(input == 4) {   //�˳�ϵͳ
				System.out.println("�˳�ϵͳ!!!");
				break;
			}else if(input == 1) {   //��ѯ����
				user.queryFlower();
			}else if(input == 2) {   //�޸Ķ���
				System.out.println("��������Ҫ�޸Ķ����ı��:");
				int tmp = sc.nextInt();
				boolean t = user.modifyFlower(tmp);
				if(t) {
					System.out.println("�޸����......");
				}else {
					System.out.println("�޸�ʧ��!!!");
				}
			}else if(input == 3) {
				System.out.println("��������Ҫɾ�������ı��:");
				int tmp = sc.nextInt();
				boolean t = user.deleteFlower(tmp);
				if(t) {
					System.out.println("ɾ���ɹ�......");
				}else {
					System.out.println("ɾ��ʧ��!!!");
				}
			}else {
				System.out.println("�����������������!");
			}
		}
	}
}
