package com.io.tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
/**
 * 序列化工具类
 * @author Administrator
 *
 */
public class IoTool {
	//序列化
	//<T>:表示静态方法支持泛型
	public static <T> void serObject(T obj,String filePath) {
		try(FileOutputStream fo = new FileOutputStream(filePath);
			ObjectOutputStream oo = new ObjectOutputStream(fo)) {
			oo.writeObject(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//反序列化
	//<T>:表示静态方法支持泛型
	// T:表示方法的返回类型为泛型
	@SuppressWarnings("unchecked")
	public static<T> T unSerObject(String filePath) {
		try(FileInputStream fi = new FileInputStream(filePath);
			ObjectInputStream oi = new ObjectInputStream(fi)) {
			return (T)oi.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;   
	}
	
	public static void copyFile(String srcPath,String destPath) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(srcPath)));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destPath)))){
			
			String str = null;
			while((str = br.readLine())!= null) {
				bw.write(str);
				//换行
				bw.newLine();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
