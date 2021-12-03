package com.zretc.bookshop.service;

import com.zretc.bookshop.entity.UserEntity;

//ҵ���߼����е���ؽӿ�
public interface UserService {
	//��¼
	public abstract UserEntity login(String userName,String userPwd);
	//�޸�����
	public abstract boolean updatePwd(UserEntity user,String newPwd1,String newPwd2);
	//�û�ע��
	public abstract boolean userRegister(String name,String pwd);
	//��ʾ�û���Ϣ
	public abstract void display();
	//ɾ���û�
	public abstract boolean remove(int n);
	//��ʾ����ͼ��
	public abstract void bookDisplay();
}
