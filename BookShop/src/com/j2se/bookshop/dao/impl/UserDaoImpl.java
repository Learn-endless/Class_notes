package com.j2se.bookshop.dao.impl;

import java.util.List;

import com.j2se.bookshop.dao.BaseDao;
import com.j2se.bookshop.dao.UserDao;
import com.j2se.bookshop.entity.BookEntity;
import com.j2se.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {
	//�û���¼
	@Override
	public UserEntity login(String userName, 
			String userPwd) {
		//��ȡ�û����󼯺�
		List<UserEntity> temp = super.getUsers();
		for(UserEntity ret:temp){
			if(ret.getUserName().equals(userName)
				&&ret.getUserPwd().equals(userPwd)){
				return ret;
			}
		}
		return null;
	}
	//�û��޸�����
	@Override
	public boolean updatePwd(UserEntity user,
			String newPwd1, String newPwd2) {
		//�ж����������Ƿ�һ��
		if(newPwd1.equals(newPwd2) == false) {
			return false;
		}
		//��ȡ�û����󼯺�
		List<UserEntity> temp = super.getUsers();
		for(UserEntity ret:temp){
			//�жϸ��û���ID�Ƿ�������Ҫ��
			if(ret.getUserId() == user.getUserId()){
				ret.setUserPwd(newPwd1);
				return true;
			}
		}
		return false;
	}
	
	//�û�ע��
	public boolean userRegister(String name,String pwd) {
		//��ȡ�û����󼯺�
		List<UserEntity> temp = super.getUsers();
		//������û�
		temp.add(new UserEntity(temp.size()+1,name,pwd,0));
		return true;
	}
	//��ʾ�û���Ϣ
	public void display(){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity ret:temp){
			System.out.println(ret);
		}
	}
	//ɾ���û�
	public boolean remove(int n){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			//ֻ�зǹ���Ա���˺Ų��ܱ�ɾ��
			if(x.getUserId() == n && x.getIdentity() == 0) {
				temp.remove(n-1);
			    return true;
			}
		}
		return false;
	}
	
	//��ʾ����ͼ��
	public void bookDisplay(){
		List<BookEntity> books = super.getBooks();
		for(BookEntity ret: books){
			System.out.println(ret);
		}
	}
}
