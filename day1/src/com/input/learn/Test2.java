package com.input.learn;

import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) {
		try(FileInputStream pf = new FileInputStream("text_5.txt")){
			int data = 0;
			StringBuilder str = new StringBuilder();
			while((data = pf.read())!=-1){
				str.append((char)data);
			}
			System.out.print(str);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
