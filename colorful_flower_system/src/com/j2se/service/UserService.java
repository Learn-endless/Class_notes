package com.j2se.service;

public interface UserService {
	//1.查询销售订单
	public void queryFlower();
	//2.修改销售订单
	public boolean modifyFlower(int date);
	//3.删除销售订单
	public boolean deleteFlower(int date);
}
