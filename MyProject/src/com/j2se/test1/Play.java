package com.j2se.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
			FileInputStream fi = new FileInputStream("play.txt")) {
			byte[] data = new byte[26];
			int lenth = fi.read(data);
			System.out.println("请输入下标：");
			int index = sc.nextInt();
			System.out.println("请输入字符");
			char ret = sc.next().charAt(0);
			data[index] = (byte)ret;
			try(FileOutputStream fo = new FileOutputStream("world.txt")) {
				fo.write(data);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
