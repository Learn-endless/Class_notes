package com.majiang.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//�ɶ��齫������
public class ChengDuMaJiangTesk {
	@Test
	public void testMaJiang() {
		//���յ��óɶ��齫��������ַ���
		String result = null;
		//ʵ�����齫��
		ChengDuMaJiang chengDuMaJiang = new ChengDuMaJiang();
		//���������е�13����
		result = chengDuMaJiang.MyChengDuMaJiang("1T8T6W6W5D4W1T3W6W2W5D6T1T");
		//�ж�������صĽ��������Ԥ�ϵĽ��
		if("17T".equals( result)||"yes".equals(result)) {
			//���һ����ͨ��
			assertEquals(1,1);
		}else {
			//��һ����ʧ��
			assertEquals(1,0);
		}
	}
}
