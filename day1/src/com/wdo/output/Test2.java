package com.wdo.output;

import java.io.FileOutputStream;

public class Test2 {
	public static void main(String[] args) {
		try(FileOutputStream output = new FileOutputStream("text_3.txt",true)){
			output.write("\r\n".getBytes());    //注意这里在windows下的换行是\r\n
			output.write("World".getBytes());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
