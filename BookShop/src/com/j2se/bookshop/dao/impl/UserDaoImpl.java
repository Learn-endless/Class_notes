package com.j2se.bookshop.dao.impl;

import java.util.List;

import com.j2se.bookshop.dao.BaseDao;
import com.j2se.bookshop.dao.UserDao;
import com.j2se.bookshop.entity.BookEntity;
import com.j2se.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {
	//用户登录
	@Override
	public UserEntity login(String userName, 
			String userPwd) {
		//获取用户对象集合
		List<UserEntity> temp = super.getUsers();
		for(UserEntity ret:temp){
			if(ret.getUserName().equals(userName)
				&&ret.getUserPwd().equals(userPwd)){
				return ret;
			}
		}
		return null;
	}
	//用户修改密码
	@Override
	public boolean updatePwd(UserEntity user,
			String newPwd1, String newPwd2) {
		//判断两次密码是否一样
		if(newPwd1.equals(newPwd2) == false) {
			return false;
		}
		//获取用户对象集合
		List<UserEntity> temp = super.getUsers();
		for(UserEntity ret:temp){
			//判断该用户的ID是否是我需要的
			if(ret.getUserId() == user.getUserId()){
				ret.setUserPwd(newPwd1);
				return true;
			}
		}
		return false;
	}
	
	//用户注册
	public boolean userRegister(String name,String pwd) {
		//获取用户对象集合
		List<UserEntity> temp = super.getUsers();
		//添加新用户
		temp.add(new UserEntity(temp.size()+1,name,pwd,0));
		return true;
	}
	//显示用户信息
	public void display(){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity ret:temp){
			System.out.println(ret);
		}
	}
	//删除用户
	public boolean remove(int n){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			//只有非管理员用账号才能被删除
			if(x.getUserId() == n && x.getIdentity() == 0) {
				temp.remove(n-1);
			    return true;
			}
		}
		return false;
	}
	
	//显示所有图书
	public void bookDisplay(){
		List<BookEntity> books = super.getBooks();
		for(BookEntity ret: books){
			System.out.println(ret);
		}
	}
}
