package com.j2se.test1;

import com.io.tool.IoTool;

public class IoTest {
	public static void main(String[] args) {
		//序列化	内存-》磁盘
		Student stu1 = new Student("张三",22,"1001011");
		IoTool.serObject(stu1, "SER.txt");
		//反序列化		磁盘-》内存
		try {
			Student stu2 = IoTool.unSerObject("SER.txt");
			System.out.println(stu2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
