package com.zretc.bookshop.dao.impl;

import java.util.Arrays;
import java.util.List;

import com.zretc.bookshop.dao.BaseDao;
import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {
	//�û���¼
	@Override
	public UserEntity login(String userName, String userPwd) {
		// TODO �Զ����ɵķ������
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			if(x.getUserName().equals(userName)&&x.getUserPwd().equals(userPwd)){
				return x;
			}
		}
		return null;
	}
	//�û��޸�����
	@Override
	public boolean updatePwd(UserEntity user, String newPwd1, String newPwd2) {
		// TODO �Զ����ɵķ������
		if(newPwd1.equals(newPwd2) == false) {
			return false;
		}
		
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			if(x.getUserId() == user.getUserId()){
				x.setUserPwd(newPwd1);
				return true;
			}
		}
		return false;
	}
	
	//�û�ע��
	public boolean userRegister(String name,String pwd) {
		List<UserEntity> temp = super.getUsers();
		temp.add(new UserEntity(temp.size()+1,name,pwd,0));
		return true;
	}
	//��ʾ�û���Ϣ
	public void display(){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			System.out.println(x);
		}
	}
	//ɾ���û�
	public boolean remove(int n){
		List<UserEntity> temp = super.getUsers();
		for(UserEntity x:temp){
			if(x.getUserId() == n);
			temp.remove(n-1);
			return true;
		}
		return false;
	}
}
