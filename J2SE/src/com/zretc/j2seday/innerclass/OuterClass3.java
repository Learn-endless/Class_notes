package com.zretc.j2seday1122.innerclass;

public class OuterClass3 {

	private String name;
	private static String sname = "我是外部类的静态成员变量";
	
	public void method(){
		System.out.println("我是外部类的成员方法！");
		InnerClass ic = new InnerClass();
		//外部类访问内部类的成员变量
		System.out.println("age="+ic.age);
		//外部类访问内部类的成员方法
		ic.innerMethod();
		InnerClass.staticInnerMethod();
		
//		new InnerClass().innerMethod();
	}
	public static void staticMethod(){
		System.out.println("我是外部类的静态成员方法！");
	}
	//静态内部类
	public static class InnerClass{
		private int age = 10;
		private static String isname = "我是内部类的静态成员变量";
		
		public void innerMethod(){
			System.out.println("我是内部类的成员方法！");
			System.out.println("sname="+sname);
			staticMethod();
		}
		
		public static void staticInnerMethod(){
			System.out.println("我是内部类的静态成员方法！");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass3 oc3 = new OuterClass3();
		oc3.method();
	}

}
