package com.zretc.j2seday1122.objecttest;

public class ObjectTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Course c1 = new Course(1, "java");
		Course c2 = new Course(1, "java");
		Course c3 = c2;
		//正常调用Object类中的equals()时，等价于==
		//当两个对象的虚地址(引用)相同时，返回true，否则为false
		
		//当重写了equals()和hashCode()方法之后，equals()方法判断的就是两个对象的属性值是否相等
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}

}
