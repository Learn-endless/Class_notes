package com.zretc.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.zretc.bookshop.entity.UserEntity;

//用户来初始化实体类的数据
public class BaseDao {
	//存放所用的用户对象
//	 protected static UserEntity[] users = new UserEntity[3];
	 static List<UserEntity> users = new ArrayList<>();
	 
	//初始化用户对象
	static {
		users.add(new UserEntity(1,"Admin","123456",1));   //默认的管理员，有且只有一个
		users.add(new UserEntity(2,"Tom","123",0));
		users.add(new UserEntity(3,"jack","456",0));
		users.add(new UserEntity(4,"rose","789",0));
	}
	//提供了一个获取所有对象的共有的方法
	public List<UserEntity> getUsers() {
		return users;
	}
}
