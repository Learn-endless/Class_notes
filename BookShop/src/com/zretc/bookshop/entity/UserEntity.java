package com.zretc.bookshop.entity;
//�û�ʵ����
public class UserEntity {
	//�û����,Ψһ
	private int userId;
	//�û���
	private String userName;
	//����
	private String userPwd;
	//���
	private int identity;
	//���췽��
	public UserEntity() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public UserEntity(int userId, String userName, String userPwd ,int identity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.identity = identity;
	}
	//������get��set����
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public int getIdentity() {
		return identity;
	}

	//��дtoString����
	@Override
	public String toString() {
		return "UserEntity [��ţ�" + userId + ", �û�����" + userName + ", Ȩ�ޣ�"+ (identity==1?"����Ա":"��ͨ�û�") + "]";
	}
	
}
