package com.j2se.dao.impl;

import java.util.List;
import java.util.Scanner;

import com.j2se.dao.BaseFlower;
import com.j2se.dao.UserDao;
import com.j2se.entity.FlowerEntity;

public class UserDaoImpl extends BaseFlower implements UserDao{
	Scanner sc = new Scanner(System.in);
	//1.查询销售订单
	@Override
	public void queryFlower() {
		List<FlowerEntity> flow = this.getFlowers();
		System.out.println("编号\t鲜花名称\t\t销售数量\t价格\t销售日期\t\t销售员\t备注");
		for (FlowerEntity x : flow) {
			System.out.println(x);
		}
	}
	
	//根据订单号返回下标
	private int findFlower(int date) {
		List<FlowerEntity> flow = this.getFlowers();
		for(int i = 0; i < flow.size(); i++) {
			if(flow.get(i).getId() == date) {
				return i;
			}
		}
		return -1;
	}
	
	//2.修改销售订单
	@Override
	public boolean modifyFlower(int date) {
		List<FlowerEntity> flow = this.getFlowers();
		boolean flag = false;
		FlowerEntity tmp = null;
		for (FlowerEntity x : flow) {
			if(x.getId() == date) {
				flag = true;
				tmp = x;
				break;
			}
		}
		if(flag) {
			System.out.println("您要修改的详细信息如下:");
			System.out.println(tmp);
			System.out.println("请输入修改后的鲜花的名称:");
			String name = sc.nextLine();
			System.out.println("请输入修改后的销售数量:");
			int number = sc.nextInt();
			System.out.println("请输入修改后的鲜花的价格:");
			double price = sc.nextDouble();
			System.out.println("请输入修改后的销售日期:(yyyy-MM-dd)");
			sc.nextLine();
			String year = sc.nextLine();
			System.out.println("请输入修改后的销售员:");
			String saler = sc.nextLine();
			System.out.println("请输入修改后的备注:");
			String beizhu = sc.nextLine();
			System.out.println("您确定要修改吗?(y/n):");
			String ok = sc.nextLine();
			int n = this.findFlower(date);
			if((n != -1) && (ok.equals("y"))) {
				flow.remove(n);
				flow.add(n, new FlowerEntity(date,name,number,price,year,saler,beizhu));
				return true;
			}
		}
		return false;
	}
	//3.删除销售订单
	@Override
	public boolean deleteFlower(int date) {
		List<FlowerEntity> flow = this.getFlowers();
		for(int i = 0; i < flow.size();i++) {
			if(flow.get(i).getId() == date) {
				System.out.println("确定需要删除吗?(y/n)");
				String ret = sc.nextLine();
				if(ret.equals("y")) {
					flow.remove(i);
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}

}
