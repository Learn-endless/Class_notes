package com.zretc.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.zretc.bookshop.entity.BookEntity;
import com.zretc.bookshop.entity.UserEntity;

//�û�����ʼ��ʵ���������
public class BaseDao {
	//������õ��û�����
//	 protected static UserEntity[] users = new UserEntity[3];
	 static List<UserEntity> users = new ArrayList<>();
	 //������ʵ�����
	 static List<BookEntity> books = new ArrayList<>();
	 
	//��ʼ���û�����
	static {
		users.add(new UserEntity(1,"Admin","123456",1));   //Ĭ�ϵĹ���Ա������ֻ��һ��
		users.add(new UserEntity(2,"Tom","123",0));
		users.add(new UserEntity(3,"jack","456",0));
		users.add(new UserEntity(4,"rose","789",0));
		
		books.add(new BookEntity(1,"ˮ䰴�","ʩ����",39.8));
		books.add(new BookEntity(2,"��¥��","��ѩ��",48.8));
		books.add(new BookEntity(3,"���μ�","��ж�",25.8));
	}
	//�ṩ��һ����ȡ���ж���Ĺ��еķ���
	public List<UserEntity> getUsers() {
		return users;
	}
	
	public List<BookEntity> getBooks(){
		return books;
	}
}
