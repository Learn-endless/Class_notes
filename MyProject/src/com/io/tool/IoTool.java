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
 * ���л�������
 * @author Administrator
 *
 */
public class IoTool {
	//���л�
	//<T>:��ʾ��̬����֧�ַ���
	public static <T> void serObject(T obj,String filePath) {
		try(FileOutputStream fo = new FileOutputStream(filePath);
			ObjectOutputStream oo = new ObjectOutputStream(fo)) {
			oo.writeObject(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�����л�
	//<T>:��ʾ��̬����֧�ַ���
	// T:��ʾ�����ķ�������Ϊ����
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
				//����
				bw.newLine();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
