package com.j2se.bookshop.service.impl;

import com.j2se.bookshop.dao.UserDao;
import com.j2se.bookshop.dao.impl.UserDaoImpl;
import com.j2se.bookshop.entity.UserEntity;
import com.j2se.bookshop.service.UserService;

public class UserServiceImpl implements UserService{
	UserDao userdao = new UserDaoImpl();
	@Override
	public UserEntity login(String userName, String userPwd) {
		// TODO �Զ����ɵķ������
		return userdao.login(userName, userPwd);
	}

	@Override
	public boolean updatePwd(UserEntity user, String newPwd1, String newPwd2) {
		// TODO �Զ����ɵķ������
		return userdao.updatePwd(user, newPwd1, newPwd2);
	}

	@Override
	public boolean userRegister(String name, String pwd) {
		// TODO �Զ����ɵķ������
		return userdao.userRegister(name, pwd);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		userdao.display();
	}

	@Override
	public boolean remove(int n) {
		// TODO Auto-generated method stub
		return userdao.remove(n);
	}
	//��ʾ����ͼ��
	public void bookDisplay(){
		userdao.bookDisplay();
	}
}