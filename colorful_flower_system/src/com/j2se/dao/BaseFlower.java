package com.j2se.dao;

import java.util.ArrayList;
import java.util.List;

import com.j2se.entity.FlowerEntity;
/**
 * ��ʼ���ʻ���
 * @author Administrator
 *
 */
public class BaseFlower {
	//������õ��ʻ����۶���
	static List<FlowerEntity> flowers = new ArrayList<>();
	//��ʼ���ʻ�����
	static {
		flowers.add(new FlowerEntity(1001,"��ɫ����-����õ��",10,318.0,"2016-12-12","������",""));
		flowers.add(new FlowerEntity(1002,"����������-��õ��",99,538.0,"2016-12-20","������",""));
		flowers.add(new FlowerEntity(1003,"���ﻨ��-��ɫ�۹�",40,148.0,"2016-12-24","������","�̲���ˮ,ӳ�����ⷱ�ǵ��"));
		flowers.add(new FlowerEntity(1004,"�Ļ�ŭ��-����ٺ�",120,188.0,"2016-12-26","������","�ڲ�����ɫ����ֽ���������ɫ����ֽ������ɫ�д�"));
		flowers.add(new FlowerEntity(1005,"���ഺ-�����İ�",1000,219.0,"2016-12-18","������","�Ұ��㣬ʤ�������飬��ʤ�����Լ���"));
		flowers.add(new FlowerEntity(1006,"��֮Ԣ��-������",2500,666.6,"2016-12-24","����","��ɽ���������"));
		flowers.add(new FlowerEntity(1007,"��������-��ɽ��",3100,584.5,"2016-12-26","����",""));
		flowers.add(new FlowerEntity(1008,"ΰ��ĸ��-����ܰ",4600,95.5,"2016-12-29","����","ĸ����ΰ��"));
	} 
	//��ȡ�����ʻ���������
	public List<FlowerEntity> getFlowers(){
		return flowers;
	}
}
