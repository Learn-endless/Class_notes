package com.input.learn;

import java.io.FileInputStream;

public class Test3 {
	public static void main(String[] args) {
		try(FileInputStream pf = new FileInputStream("text_6.txt")){
			byte[] b = new byte[1024];
			int lenth = 0;
			int count = 0;
			StringBuilder ret = new StringBuilder();
			while((lenth = pf.read(b))!= -1){
				String str = new String(b,0,lenth);
				ret.append(str);
				count++;
			}
			System.out.println(ret);
			System.out.println(count);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
