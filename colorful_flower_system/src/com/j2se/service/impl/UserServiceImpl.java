package com.j2se.service.impl;

import com.j2se.dao.UserDao;
import com.j2se.dao.impl.UserDaoImpl;
import com.j2se.service.UserService;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	//1.��ѯ���۶���
	@Override
	public void queryFlower() {
		// TODO �Զ����ɵķ������
		userDao.queryFlower();
	}
	//2.�޸����۶���
	@Override
	public boolean modifyFlower(int date) {
		// TODO �Զ����ɵķ������
		return userDao.modifyFlower(date);
	}
	//3.ɾ�����۶���
	@Override
	public boolean deleteFlower(int date) {
		// TODO �Զ����ɵķ������
		return userDao.deleteFlower(date);
	}

}
