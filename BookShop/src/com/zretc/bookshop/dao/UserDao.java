package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.UserEntity;

//数据访问层中用户相关的借口
public interface UserDao {
	//登录
	public abstract UserEntity login(String userName,String userPwd);
	//修改密码
	public abstract boolean updatePwd(UserEntity user,String newPwd1,String newPwd2);
	//用户注册
	public boolean userRegister(String name,String pwd);
	//显示用户信息
	public void display();
	//删除用户
	public boolean remove(int n);
	//显示所有图书
	public void bookDisplay();
}
