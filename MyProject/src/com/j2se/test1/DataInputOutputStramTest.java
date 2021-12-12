package com.donghu.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 我定义一个Student数组，使用DataOutputStream将数组的数据
 * 写入磁盘，然后使用DataInputStream将数据读取出来并且打印
 * 步骤：
 * 1 定义Student数组
 * 2 将数组中的每个元素写入到磁盘(DataOutputStream)
 * 3 读取磁盘的数据（DataInputStream）
 * @author Administrator
 *
 */
public class DataInputOutputStramTest {

	/**
	 * 学生数组，程序运行时将数组里面的对象写入磁盘
	 */
	private static Student[] students = {
			new Student(101,"Jim",'M',89.5, true),
			new Student(107,"Jack",'M',81.5, false),
			new Student(105,"Nancy",'F',88.5,false),
	};
	
	public static void main(String[] args) {
		try (
				DataOutputStream dos =
					new DataOutputStream(
							new FileOutputStream("students"));
				){
		 // 使用循环将数组每个元素的基本属性类型数据写入磁盘
			for (int i = 0; i < students.length; i++) {
				dos.writeInt(students[i].getId());
				dos.writeUTF(students[i].getStuName());
				dos.writeChar(students[i].getStuGender());
				dos.writeDouble(students[i].getStuScore());
				dos.writeBoolean(students[i].isSmoking());
			}
			try(
					DataInputStream dis = 
							new DataInputStream(
									new FileInputStream("students"));
					) {
				// 	读取磁盘的数据
				for (int i = 0; i< students.length; i++) {
					int id = dis.readInt();
					String stuName = dis.readUTF();
					char stuGerden = dis.readChar();
					double stuScore = dis.readDouble();
					boolean stuSmoking = dis.readBoolean();
					System.out.println(id+"-"+stuName+"-"+stuGerden+"-"+stuScore+"-"+stuSmoking);
				}
			}
		} catch (Exception e) {
			System.err.println("读写失败");
			e.printStackTrace();
		}
	}
}
