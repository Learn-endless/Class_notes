package com.zretc.bookshop.dao.impl;

import java.util.Arrays;
import java.util.List;

import com.zretc.bookshop.dao.BaseDao;
import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.entity.BookEntity;
import com.zretc.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {
	//用户登录
	@Override
	public UserEntity login(String userName, String userPwd) {
		// TODO 自动生成的方法存根
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			if(x.getUserName().equals(userName)&&x.getUserPwd().equals(userPwd)){
				return x;
			}
		}
		return null;
	}
	//用户修改密码
	@Override
	public boolean updatePwd(UserEntity user, String newPwd1, String newPwd2) {
		// TODO 自动生成的方法存根
		if(newPwd1.equals(newPwd2) == false) {
			return false;
		}
		
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			if(x.getUserId() == user.getUserId()){
				x.setUserPwd(newPwd1);
				return true;
			}
		}
		return false;
	}
	
	//用户注册
	public boolean userRegister(String name,String pwd) {
		List<UserEntity> temp = super.getUsers();
		temp.add(new UserEntity(temp.size()+1,name,pwd,0));
		return true;
	}
	//显示用户信息
	public void display(){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			System.out.println(x);
		}
	}
	//删除用户
	public boolean remove(int n){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			if(x.getUserId() == n);
			temp.remove(n-1);
			return true;
		}
		return false;
	}
	
	//显示所有图书
	public void bookDisplay(){
		List<BookEntity> books = super.getBooks();
		for(BookEntity x: books){
			System.out.println(x);
		}
	}
}
