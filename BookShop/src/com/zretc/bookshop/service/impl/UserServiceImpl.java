package com.zretc.bookshop.service.impl;

import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.dao.impl.UserDaoImpl;
import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;

public class UserServiceImpl implements UserService{
	UserDao userdao = new UserDaoImpl();
	@Override
	public UserEntity login(String userName, String userPwd) {
		// TODO 自动生成的方法存根
		return userdao.login(userName, userPwd);
	}

	@Override
	public boolean updatePwd(UserEntity user, String newPwd1, String newPwd2) {
		// TODO 自动生成的方法存根
		return userdao.updatePwd(user, newPwd1, newPwd2);
	}

	@Override
	public boolean userRegister(String name, String pwd) {
		// TODO 自动生成的方法存根
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
	//显示所有图书
	public void bookDisplay(){
		userdao.bookDisplay();
	}
}
