package com.zretc.j2seday1122.objecttest;

public class ObjectTest2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Course c1 = new Course(1, "java");
		Course c2 = new Course(1, "java");
		Course c3 = c2;
		//��������Object���е�equals()ʱ���ȼ���==
		//��������������ַ(����)��ͬʱ������true������Ϊfalse
		
		//����д��equals()��hashCode()����֮��equals()�����жϵľ����������������ֵ�Ƿ����
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}

}
