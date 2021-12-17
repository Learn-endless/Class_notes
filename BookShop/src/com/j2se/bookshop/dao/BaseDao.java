package com.j2se.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.j2se.bookshop.entity.BookEntity;
import com.j2se.bookshop.entity.UserEntity;


//�û�����ʼ��ʵ���������
public class BaseDao {
	//������õ��û�����,ʹ��һ������˳���ļ���
	 static List<UserEntity> users = new ArrayList<>();
	 //������ʵ�����,Ҳʹ��һ������
	 static List<BookEntity> books = new ArrayList<>();
	 
	//��ʼ���û�����
	static {
		users.add(new UserEntity(1,"Admin","123456",1));   //Ĭ�ϵĹ���Ա������ֻ��һ��
		users.add(new UserEntity(2,"Tom","123",0));
		users.add(new UserEntity(3,"jack","456",0));
		users.add(new UserEntity(4,"rose","789",0));
		
		books.add(new BookEntity(1,"ƽ��������","·ң",39.8));
		books.add(new BookEntity(2,"��˹�ֵ�����","����",48.8));
		books.add(new BookEntity(3,"Ų����ɭ��","���ϴ���",25.8));
	}
	//�ṩ��һ����������ȡ�����û�����
	public List<UserEntity> getUsers() {
		return users;  //����ֵ��һ������
	}
	//�ṩһ����������ȡ����ͼ�����
	public List<BookEntity> getBooks(){
		return books; //����ֵͬ����һ������
	}
}
