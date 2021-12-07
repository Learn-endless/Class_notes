package com.zretc.j2seday1122.objecttest;

public class ObjectTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Course c1 = new Course(1, "java");
		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println(c1.getClass());
		System.out.println(c1.hashCode());
		//com.zretc.j2seday1122.Course@15db9742
		//包名.类名@十六进制的数值
		//getClass().getName() 获取到包名.类名
		Integer.toHexString(c1.hashCode()); //获取到十六进制的数值 

	}

}
