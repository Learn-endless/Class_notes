package com.zretc.j2seday1122.innerclass;
public class OuterClass4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo() {
			@Override
			public void test() {
				System.out.println("���������ڲ���ķ�����");
			}
		};
		foo.test();
		Coo1 coo1 = new Coo1(){
			@Override
			void test1() {
				System.out.println("��������ķ���---test(1)");
			}
		};
		coo1.test1();
		Coo2 coo2 = new Coo2(){
			@Override
			void test1() {
				System.out.println("��������ķ���---test(2)");
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
		System.out.println("���Ǹ���ķ�����");
	}
}

class Coo2{
	void test1(){
		System.out.println("���Ǹ���ķ�����");
	}
}