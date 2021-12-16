package com.j2se.service.impl;

import com.j2se.dao.UserDao;
import com.j2se.dao.impl.UserDaoImpl;
import com.j2se.service.UserService;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	//1.查询销售订单
	@Override
	public void queryFlower() {
		// TODO 自动生成的方法存根
		userDao.queryFlower();
	}
	//2.修改销售订单
	@Override
	public boolean modifyFlower(int date) {
		// TODO 自动生成的方法存根
		return userDao.modifyFlower(date);
	}
	//3.删除销售订单
	@Override
	public boolean deleteFlower(int date) {
		// TODO 自动生成的方法存根
		return userDao.deleteFlower(date);
	}

}
