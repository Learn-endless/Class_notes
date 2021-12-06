package com.bit.learn;

import java.util.Scanner;

public class TryWithResourceTest {
	
	//使用try with resource 可以不用手动关闭资源
	//只有实现了AutoCloseable接口的类才能写在try with resource里面
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("请输入");
			String str = sc.nextLine();
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//平常使用时需要使用finally手动关闭资源
	public static void main_1(String[] args) {
		Scanner sc = null;
		try{
			sc = new Scanner(System.in);
			System.out.println("请输入");
			String str = sc.nextLine();
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sc != null){
				sc.close();
			}
		}
	}
}
