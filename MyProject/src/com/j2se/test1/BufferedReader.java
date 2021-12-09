package com.j2se.test1;
//字符流的装饰流
import java.io.BufferedWriter;
//import java.io.BufferdeReader;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferedReader {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("src.txt");
			java.io.BufferedReader br = new java.io.BufferedReader(fr);
			FileWriter fw = new FileWriter("dest.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			String str = null;
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
