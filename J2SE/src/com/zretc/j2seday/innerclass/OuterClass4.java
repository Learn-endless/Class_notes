package com.zretc.j2seday1122.innerclass;
public class OuterClass4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo() {
			@Override
			public void test() {
				System.out.println("我是匿名内部类的方法！");
			}
		};
		foo.test();
		Coo1 coo1 = new Coo1(){
			@Override
			void test1() {
				System.out.println("我是子类的方法---test(1)");
			}
		};
		coo1.test1();
		Coo2 coo2 = new Coo2(){
			@Override
			void test1() {
				System.out.println("我是子类的方法---test(2)");
			}
		};
		coo2.test1();
	}
}
interface Foo{
	void test();
}

class Coo1{
	void test1(){
		System.out.println("我是父类的方法！");
	}
}

class Coo2{
	void test1(){
		System.out.println("我是父类的方法！");
	}
}