package com.j2se.dao.impl;

import java.util.List;
import java.util.Scanner;

import com.j2se.dao.BaseFlower;
import com.j2se.dao.UserDao;
import com.j2se.entity.FlowerEntity;

public class UserDaoImpl extends BaseFlower implements UserDao{
	Scanner sc = new Scanner(System.in);
	//1.��ѯ���۶���
	@Override
	public void queryFlower() {
		List<FlowerEntity> flow = this.getFlowers();
		System.out.println("���\t�ʻ�����\t\t��������\t�۸�\t��������\t\t����Ա\t��ע");
		for (FlowerEntity x : flow) {
			System.out.println(x);
		}
	}
	
	//���ݶ����ŷ����±�
	private int findFlower(int date) {
		List<FlowerEntity> flow = this.getFlowers();
		for(int i = 0; i < flow.size(); i++) {
			if(flow.get(i).getId() == date) {
				return i;
			}
		}
		return -1;
	}
	
	//2.�޸����۶���
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
			System.out.println("��Ҫ�޸ĵ���ϸ��Ϣ����:");
			System.out.println(tmp);
			System.out.println("�������޸ĺ���ʻ�������:");
			String name = sc.nextLine();
			System.out.println("�������޸ĺ����������:");
			int number = sc.nextInt();
			System.out.println("�������޸ĺ���ʻ��ļ۸�:");
			double price = sc.nextDouble();
			System.out.println("�������޸ĺ����������:(yyyy-MM-dd)");
			sc.nextLine();
			String year = sc.nextLine();
			System.out.println("�������޸ĺ������Ա:");
			String saler = sc.nextLine();
			System.out.println("�������޸ĺ�ı�ע:");
			String beizhu = sc.nextLine();
			System.out.println("��ȷ��Ҫ�޸���?(y/n):");
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
	//3.ɾ�����۶���
	@Override
	public boolean deleteFlower(int date) {
		List<FlowerEntity> flow = this.getFlowers();
		for(int i = 0; i < flow.size();i++) {
			if(flow.get(i).getId() == date) {
				System.out.println("ȷ����Ҫɾ����?(y/n)");
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
