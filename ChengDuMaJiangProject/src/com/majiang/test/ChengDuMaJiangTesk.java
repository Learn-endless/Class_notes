package com.majiang.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//成都麻将测试类
public class ChengDuMaJiangTesk {
	@Test
	public void testMaJiang() {
		//接收调用成都麻将函数后的字符串
		String result = null;
		//实力化麻将类
		ChengDuMaJiang chengDuMaJiang = new ChengDuMaJiang();
		//传入我手中的13张牌
		result = chengDuMaJiang.MyChengDuMaJiang("1T8T6W6W5D4W1T3W6W2W5D6T1T");
		//判断如果返回的结果和我所预料的结果
		if("17T".equals( result)||"yes".equals(result)) {
			//结果一样，通过
			assertEquals(1,1);
		}else {
			//不一样，失败
			assertEquals(1,0);
		}
	}
}
