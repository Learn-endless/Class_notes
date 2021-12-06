package com.input.learn;

import java.io.FileInputStream;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		try (FileInputStream pf = new FileInputStream("text_4.txt")) {
			byte[] b = new byte[3];
			pf.read(b);
			System.out.println(Arrays.toString(b));
			String str = new String(b);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
