package com.j2se.bookshop.dao;

import com.j2se.bookshop.entity.UserEntity;

//���ݷ��ʲ����û���صĽ��
public interface UserDao {
	//��¼
	public abstract UserEntity login(String userName,String userPwd);
	//�޸�����
	public abstract boolean updatePwd(UserEntity user,String newPwd1,String newPwd2);
	//�û�ע��
	public boolean userRegister(String name,String pwd);
	//��ʾ�û���Ϣ
	public void display();
	//ɾ���û�
	public boolean remove(int n);
	//��ʾ����ͼ��
	public void bookDisplay();
}
