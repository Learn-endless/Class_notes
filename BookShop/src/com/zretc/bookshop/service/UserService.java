package com.zretc.bookshop.service;

import com.zretc.bookshop.entity.UserEntity;

//业务逻辑层中的相关接口
public interface UserService {
	//登录
	public abstract UserEntity login(String userName,String userPwd);
	//修改密码
	public abstract boolean updatePwd(UserEntity user,String newPwd1,String newPwd2);
	//用户注册
	public abstract boolean userRegister(String name,String pwd);
	//显示用户信息
	public abstract void display();
	//删除用户
	public abstract boolean remove(int n);
	//显示所有图书
	public abstract void bookDisplay();
}
