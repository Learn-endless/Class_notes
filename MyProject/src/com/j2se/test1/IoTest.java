package com.j2se.test1;

import com.io.tool.IoTool;

public class IoTest {
	public static void main(String[] args) {
		//���л�	�ڴ�-������
		Student stu1 = new Student("����",22,"1001011");
		IoTool.serObject(stu1, "SER.txt");
		//�����л�		����-���ڴ�
		try {
			Student stu2 = IoTool.unSerObject("SER.txt");
			System.out.println(stu2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
