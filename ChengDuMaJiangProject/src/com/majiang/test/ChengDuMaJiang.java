package com.majiang.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * �ɶ��齫ʵ����
 */
public class ChengDuMaJiang {
	public String MyChengDuMaJiang(String line) {
		int[] inputPai = new int[27];  //ÿһ�ֶ��Ǵ�1-9����new����27��Ԫ�ص���������
		int[] newPai = new int[27];
		//����һ���������������Ҫ������
		List<String> savePai = new ArrayList<String>();
		for(int i=1;i<line.length();i += 2){
			String ret = "" + line.charAt(i-1);  //�ҵ�T��D��Wǰ����Ǹ������ַ�
			int num = Integer.parseInt(ret)-1;   //����ת��Ϊ����-1(�����±��0��ʼ)
			
			//�ж������������Ͳ���������е���һ��
			if(line.charAt(i)=='T'){
				inputPai[num]++;        //����Ӧ�����±����һλ��1
			}else if(line.charAt(i)=='D'){
				inputPai[num+9]++;
			}else if(line.charAt(i)=='W'){
				inputPai[num+9*2]++;
			}
		}
		//��ʱinputPai��������ʹ��˵�ǰ�������
		//�����ж��ұ�����������Ƿ��Ǻ���
		if(huPai(inputPai)) {
			return "yes";  //�ǵķ���һ��yes
		}
		//Ȼ��������������
		for(int i=0;i<27;i++){ 
			int[] date = Arrays.copyOf(inputPai, 27);    //����һ�ݽ��в���
			date[i]++;                //�Ӽ�һ��1T��ʼ��
			
			for(int j=0;j<27;j++)
				newPai[j] = date[j];  //���ƴ�ŵ�newPai������
			
			if(huPai(newPai))              //�ж��⸱���Ƿ����
				savePai.add(translate(i));  //�ǵģ���������ӵ�������
		}
		
		System.out.println("���Ƹ���:"+savePai.size());   //��ӡ��ʾһ��
		
		String ret = String.valueOf(savePai.size());
		for(String y:savePai)
			System.out.println("��ҪҪ�����ƣ�"+y);
		String n = String.join(ret, savePai);
		System.out.println(ret+n);
		return ret+n;    //���غ��Ƹ������Ϻ����Ƶ��ַ���
	}
 
	/**
	 * ����λ�ö�Ӧ����ת��Ϊһ���ַ���
	 */
	private String translate(int i) {
		String ret = null;
		//�ж�T��D��W
		if(i < 9) {
			ret = "T";
		}else if(i < 18) {
			ret = "D";
		}else{
			ret = "W";
		}
		//ת����һ������+���͵��ַ�������
		return String.valueOf(i+1)+ret;
	}
	/**
	 * �жϸø����Ƿ����
	 */
	private boolean huPai(int[] date) {
		
		return tryHU(date, 14);
	}
 
	/**
	 * ʹ�õݹ����ж��Ƿ����
	 */
	private boolean tryHU(int[] date, int n) {
		//�ݹ��������
		if(n==0)
			return true;
		//�ж϶���
		if(n%3==2){
			for(int i=0;i<27;i++){
				if(date[i]>=2){
					date[i] -= 2;
					if(tryHU(date, n - 2))
						return true;
					date[i] += 2;
				}
			}
		}
		//�ж�����һ������
		for(int i=0;i<27;i++){
			if(date[i]>=3){
				date[i] -= 3;
				if(tryHU(date, n - 3))
					return true;
				date[i] += 3;
			}
		}
		//�ж��������Ƿ���˳��
		for(int i=0;i<27-2;i++){
			if(date[i]>0&&date[i+1]>0&&date[i+2]>0){
				date[i] -= 1;
				date[i+1] -= 1;
				date[i+2] -= 1;
				if(tryHU(date, n - 3))
					return true;
				date[i] += 1;
				date[i+1] += 1;
				date[i+2] += 1;
			}
		}
		return false;
	}
}
