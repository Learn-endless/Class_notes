package com.zretc.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.zretc.bookshop.entity.UserEntity;

//�û�����ʼ��ʵ���������
public class BaseDao {
	//������õ��û�����
//	 protected static UserEntity[] users = new UserEntity[3];
	 static List<UserEntity> users = new ArrayList<>();
	 
	//��ʼ���û�����
	static {
		users.add(new UserEntity(1,"Admin","123456",1));   //Ĭ�ϵĹ���Ա������ֻ��һ��
		users.add(new UserEntity(2,"Tom","123",0));
		users.add(new UserEntity(3,"jack","456",0));
		users.add(new UserEntity(4,"rose","789",0));
	}
	//�ṩ��һ����ȡ���ж���Ĺ��еķ���
	public List<UserEntity> getUsers() {
		return users;
	}
}
