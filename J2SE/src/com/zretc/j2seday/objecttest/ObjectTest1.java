package com.zretc.j2seday1122.objecttest;

public class ObjectTest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Course c1 = new Course(1, "java");
		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println(c1.getClass());
		System.out.println(c1.hashCode());
		//com.zretc.j2seday1122.Course@15db9742
		//����.����@ʮ�����Ƶ���ֵ
		//getClass().getName() ��ȡ������.����
		Integer.toHexString(c1.hashCode()); //��ȡ��ʮ�����Ƶ���ֵ 

	}

}
