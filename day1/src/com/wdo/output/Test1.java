package com.wdo.output;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Test1 {

	public static void main(String[] args) {
		//这是一个绝对路径
		try(FileOutputStream output = new FileOutputStream("text_1.txt")){                                              
			byte[] b = {97,98,99,100,101,102};
			output.write(b);
			output.write(65);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try(FileWriter pf = new FileWriter("text_2.txt")){
			pf.write("hello world");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
