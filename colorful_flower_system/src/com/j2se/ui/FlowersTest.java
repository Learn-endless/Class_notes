package com.j2se.ui;

import java.util.Scanner;

import com.j2se.service.impl.UserServiceImpl;

public class FlowersTest {
	//菜单
	public static void menu() {
		System.out.println("========鲜花销售系统========");
		System.out.println("1.查询销售订单");
		System.out.println("2.修改销售订单");
		System.out.println("3.删除销售订单");
		System.out.println("4.退出系统!");
		System.out.println("============================");
	}
	
	public static void main(String[] args) {
		UserServiceImpl user = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			System.out.println("请输入》》");
			int input = sc.nextInt();
			if(input == 4) {   //退出系统
				System.out.println("退出系统!!!");
				break;
			}else if(input == 1) {   //查询订单
				user.queryFlower();
			}else if(input == 2) {   //修改订单
				System.out.println("请输入需要修改订单的编号:");
				int tmp = sc.nextInt();
				boolean t = user.modifyFlower(tmp);
				if(t) {
					System.out.println("修改完成......");
				}else {
					System.out.println("修改失败!!!");
				}
			}else if(input == 3) {
				System.out.println("请输入需要删除订单的编号:");
				int tmp = sc.nextInt();
				boolean t = user.deleteFlower(tmp);
				if(t) {
					System.out.println("删除成功......");
				}else {
					System.out.println("删除失败!!!");
				}
			}else {
				System.out.println("输入错误，请重新输入!");
			}
		}
	}
}
