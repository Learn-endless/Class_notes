package com.j2se.project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
*将text_src文件里面的内容拷贝到text_dest文件里面
*/
public class TestDemo {
	public static void main(String[] args) {
		try(FileInputStream pf = new FileInputStream("text_src.txt");
			FileOutputStream pi = new FileOutputStream("text_dest.txt")){
			
			byte[] b = new byte[1024];
			int lenth = 0;
			while((lenth = pf.read(b))!= -1){
				pi.write(b,0,lenth);
			}
			pi.flush();
			System.out.println("拷贝成功...");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("拷贝失败！");
		}
	}
}
