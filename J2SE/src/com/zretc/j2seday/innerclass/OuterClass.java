package com.zretc.j2seday1122.innerclass;
//�ⲿ��
public class OuterClass {
	private String name;//����
	private int age;//����
	//��Ա�ڲ���
	public class InnerClass{
		private String str = "�����ڲ���ĳ�Ա������";
		//�ڲ�����Է����ⲿ��ĳ�Ա����
		public InnerClass(){
			name = "С��";
			age = 35;
		}
		public void InnerTest(){
			System.out.println("�����ڲ���ĳ�Ա������");
			System.out.println(this.str);
			System.out.println(OuterClass.this.name);
			//�ڲ�����Է����ⲿ��ĳ�Ա����
//			outerTest();
		}
	}
	public void outerTest(){
		InnerClass ic = new InnerClass();
		System.out.println("str="+ic.str);
		ic.InnerTest();
		System.out.println("�����ⲿ��ĳ�Ա������");
	}
	public static void main(String[] args) {
		//�ⲿ��Ķ���oc
		OuterClass oc = new OuterClass();
		oc.outerTest();
		//�ڲ���Ķ���ic
		OuterClass.InnerClass ic = oc.new InnerClass();
//		ic.InnerTest();
		
	}

}

