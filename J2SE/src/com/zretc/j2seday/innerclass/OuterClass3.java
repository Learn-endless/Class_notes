package com.zretc.j2seday1122.innerclass;

public class OuterClass3 {

	private String name;
	private static String sname = "�����ⲿ��ľ�̬��Ա����";
	
	public void method(){
		System.out.println("�����ⲿ��ĳ�Ա������");
		InnerClass ic = new InnerClass();
		//�ⲿ������ڲ���ĳ�Ա����
		System.out.println("age="+ic.age);
		//�ⲿ������ڲ���ĳ�Ա����
		ic.innerMethod();
		InnerClass.staticInnerMethod();
		
//		new InnerClass().innerMethod();
	}
	public static void staticMethod(){
		System.out.println("�����ⲿ��ľ�̬��Ա������");
	}
	//��̬�ڲ���
	public static class InnerClass{
		private int age = 10;
		private static String isname = "�����ڲ���ľ�̬��Ա����";
		
		public void innerMethod(){
			System.out.println("�����ڲ���ĳ�Ա������");
			System.out.println("sname="+sname);
			staticMethod();
		}
		
		public static void staticInnerMethod(){
			System.out.println("�����ڲ���ľ�̬��Ա������");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass3 oc3 = new OuterClass3();
		oc3.method();
	}

}
