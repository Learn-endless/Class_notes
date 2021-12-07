package com.zretc.j2seday1122.innerclass;
//外部类
public class OuterClass2 {
	private String name;//姓名
	private int age;//年龄
	//成员方法
	public void outerTest(int num){
		//局部内部类
		int x = 20;
		class InnerClass{
			int n = 1;
			private String str = "我是内部类的成员变量！";
			public InnerClass(){
				name = "小马";
				age = 35;
				//局部内部类访问局部变量时，该变量为final修饰的常量
//				num = 1;
				n = 10;
//				x = 10;
			}
			public void InnerTest(){
				System.out.println("name="+name+",age="+age+",num="+num);
				System.out.println("我是内部类的成员方法！");
			}
		}
		//创建局部内部类对象
		InnerClass ic = new InnerClass();
		System.out.println("str"+ic.str);
		ic.InnerTest();
	}
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.outerTest(5);
	}

}
