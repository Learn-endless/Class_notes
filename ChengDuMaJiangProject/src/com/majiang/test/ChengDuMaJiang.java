package com.majiang.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 成都麻将实体类
 */
public class ChengDuMaJiang {
	public String MyChengDuMaJiang(String line) {
		int[] inputPai = new int[27];  //每一种都是从1-9所以new两个27个元素的整形数组
		int[] newPai = new int[27];
		//定义一个集合来存放所需要胡的牌
		List<String> savePai = new ArrayList<String>();
		for(int i=1;i<line.length();i += 2){
			String ret = "" + line.charAt(i-1);  //找到T、D、W前面的那个数字字符
			int num = Integer.parseInt(ret)-1;   //将它转换为整数-1(数组下标从0开始)
			
			//判断所输入的牌是筒、条、万中的哪一个
			if(line.charAt(i)=='T'){
				inputPai[num]++;        //将对应整数下标的那一位加1
			}else if(line.charAt(i)=='D'){
				inputPai[num+9]++;
			}else if(line.charAt(i)=='W'){
				inputPai[num+9*2]++;
			}
		}
		//此时inputPai数组里面就存了当前传入的牌
		//首先判断我本来传入的牌是否是胡牌
		if(huPai(inputPai)) {
			return "yes";  //是的返回一个yes
		}
		//然后试着让它胡牌
		for(int i=0;i<27;i++){ 
			int[] date = Arrays.copyOf(inputPai, 27);    //拷贝一份进行操作
			date[i]++;                //从加一个1T开始试
			
			for(int j=0;j<27;j++)
				newPai[j] = date[j];  //新牌存放到newPai数组里
			
			if(huPai(newPai))              //判断这副牌是否胡牌
				savePai.add(translate(i));  //是的，将改牌添加到集合里
		}
		
		System.out.println("胡牌个数:"+savePai.size());   //打印提示一下
		
		String ret = String.valueOf(savePai.size());
		for(String y:savePai)
			System.out.println("需要要胡的牌："+y);
		String n = String.join(ret, savePai);
		System.out.println(ret+n);
		return ret+n;    //返回胡牌个数加上胡的牌的字符串
	}
 
	/**
	 * 将该位置对应的牌转换为一个字符串
	 */
	private String translate(int i) {
		String ret = null;
		//判断T、D、W
		if(i < 9) {
			ret = "T";
		}else if(i < 18) {
			ret = "D";
		}else{
			ret = "W";
		}
		//转换成一个数字+类型的字符串返回
		return String.valueOf(i+1)+ret;
	}
	/**
	 * 判断该副牌是否胡牌
	 */
	private boolean huPai(int[] date) {
		
		return tryHU(date, 14);
	}
 
	/**
	 * 使用递归来判断是否胡牌
	 */
	private boolean tryHU(int[] date, int n) {
		//递归结束条件
		if(n==0)
			return true;
		//判断对子
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
		//判断三张一样的牌
		for(int i=0;i<27;i++){
			if(date[i]>=3){
				date[i] -= 3;
				if(tryHU(date, n - 3))
					return true;
				date[i] += 3;
			}
		}
		//判断三张牌是否是顺子
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
