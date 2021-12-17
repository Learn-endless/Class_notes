package com.j2se.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.j2se.bookshop.entity.BookEntity;
import com.j2se.bookshop.entity.UserEntity;


//用户来初始化实体类的数据
public class BaseDao {
	//存放所用的用户对象,使用一个基于顺序表的集合
	 static List<UserEntity> users = new ArrayList<>();
	 //存放书的实体对象,也使用一个集合
	 static List<BookEntity> books = new ArrayList<>();
	 
	//初始化用户对象
	static {
		users.add(new UserEntity(1,"Admin","123456",1));   //默认的管理员，有且只有一个
		users.add(new UserEntity(2,"Tom","123",0));
		users.add(new UserEntity(3,"jack","456",0));
		users.add(new UserEntity(4,"rose","789",0));
		
		books.add(new BookEntity(1,"平凡的世界","路遥",39.8));
		books.add(new BookEntity(2,"穆斯林的葬礼","霍达",48.8));
		books.add(new BookEntity(3,"挪威的森林","村上春树",25.8));
	}
	//提供了一个方法来获取所有用户对象
	public List<UserEntity> getUsers() {
		return users;  //返回值是一个集合
	}
	//提供一个方法来获取所有图书对象
	public List<BookEntity> getBooks(){
		return books; //返回值同样是一个集合
	}
}
