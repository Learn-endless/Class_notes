package com.zretc.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.zretc.bookshop.entity.BookEntity;
import com.zretc.bookshop.entity.UserEntity;

//用户来初始化实体类的数据
public class BaseDao {
	//存放所用的用户对象
//	 protected static UserEntity[] users = new UserEntity[3];
	 static List<UserEntity> users = new ArrayList<>();
	 //存放书的实体对象
	 static List<BookEntity> books = new ArrayList<>();
	 
	//初始化用户对象
	static {
		users.add(new UserEntity(1,"Admin","123456",1));   //默认的管理员，有且只有一个
		users.add(new UserEntity(2,"Tom","123",0));
		users.add(new UserEntity(3,"jack","456",0));
		users.add(new UserEntity(4,"rose","789",0));
		
		books.add(new BookEntity(1,"水浒传","施耐庵",39.8));
		books.add(new BookEntity(2,"红楼梦","曹雪芹",48.8));
		books.add(new BookEntity(3,"西游记","吴承恩",25.8));
	}
	//提供了一个获取所有对象的共有的方法
	public List<UserEntity> getUsers() {
		return users;
	}
	
	public List<BookEntity> getBooks(){
		return books;
	}
}
