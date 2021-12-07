package com.zretc.j2seday1122.baozhuang;

public class CharacterTest {

	public static void main(String[] args) {
		// TODO	 Auto-generated method stub
		char[] ch = {'a','V','3',' ','R','d','#','2','m'};
		int num1 = 0;//´óĞ´×ÖÄ¸
		for(int i=0;i<ch.length;i++){
			if(Character.isWhitespace(ch[i])){
				num1++;
			}
		}
		System.out.println("¿Õ¸ñ:"+num1);
	}

}
