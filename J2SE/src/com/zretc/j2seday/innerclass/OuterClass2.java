package com.zretc.j2seday1122.innerclass;
//�ⲿ��
public class OuterClass2 {
	private String name;//����
	private int age;//����
	//��Ա����
	public void outerTest(int num){
		//�ֲ��ڲ���
		int x = 20;
		class InnerClass{
			int n = 1;
			private String str = "�����ڲ���ĳ�Ա������";
			public InnerClass(){
				name = "С��";
				age = 35;
				//�ֲ��ڲ�����ʾֲ�����ʱ���ñ���Ϊfinal���εĳ���
//				num = 1;
				n = 10;
//				x = 10;
			}
			public void InnerTest(){
				System.out.println("name="+name+",age="+age+",num="+num);
				System.out.println("�����ڲ���ĳ�Ա������");
			}
		}
		//�����ֲ��ڲ������
		InnerClass ic = new InnerClass();
		System.out.println("str"+ic.str);
		ic.InnerTest();
	}
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.outerTest(5);
	}

}
