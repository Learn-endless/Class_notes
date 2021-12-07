package com.zretc.j2seday1122.objecttest;

public class Course {
	private int cid;//�γ�id
	private String cname;//�γ�����
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Course() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public String toString() {
		//��дObject���toString()���������Զ����ʽ�����ض�������ֵ���ַ���
		return "�γ� [�γ�id=" + cid + ", �γ�����=" + cname + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (cid != other.cid)
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		return true;
	}
	
}
