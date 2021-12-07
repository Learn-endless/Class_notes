package com.zretc.j2seday1122.innerclass;
//外部类
public class OuterClass {
	private String name;//姓名
	private int age;//年龄
	//成员内部类
	public class InnerClass{
		private String str = "我是内部类的成员变量！";
		//内部类可以访问外部类的成员变量
		public InnerClass(){
			name = "小马";
			age = 35;
		}
		public void InnerTest(){
			System.out.println("我是内部类的成员方法！");
			System.out.println(this.str);
			System.out.println(OuterClass.this.name);
			//内部类可以访问外部类的成员方法
//			outerTest();
		}
	}
	public void outerTest(){
		InnerClass ic = new InnerClass();
		System.out.println("str="+ic.str);
		ic.InnerTest();
		System.out.println("我是外部类的成员方法！");
	}
	public static void main(String[] args) {
		//外部类的对象：oc
		OuterClass oc = new OuterClass();
		oc.outerTest();
		//内部类的对象：ic
		OuterClass.InnerClass ic = oc.new InnerClass();
//		ic.InnerTest();
		
	}

}

