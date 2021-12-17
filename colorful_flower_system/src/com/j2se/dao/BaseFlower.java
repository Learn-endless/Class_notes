package com.j2se.dao;

import java.util.ArrayList;
import java.util.List;

import com.j2se.entity.FlowerEntity;
/**
 * 初始化鲜花类
 * @author Administrator
 *
 */
public class BaseFlower {
	//存放所用的鲜花销售订单
	static List<FlowerEntity> flowers = new ArrayList<>();
	//初始化鲜花对象
	static {
		flowers.add(new FlowerEntity(1001,"金色海岸-香槟玫瑰",10,318.0,"2016-12-12","王二妮",""));
		flowers.add(new FlowerEntity(1002,"初心永不变-白玫瑰",99,538.0,"2016-12-20","张欣雨",""));
		flowers.add(new FlowerEntity(1003,"梦里花开-紫色桔梗",40,148.0,"2016-12-24","王二妮","烟波入水,映出窗外繁星点点"));
		flowers.add(new FlowerEntity(1004,"心花怒放-粉香百合",120,188.0,"2016-12-26","王二妮","内层银灰色厚棉纸，外层深蓝色条纹纸，银灰色缎带"));
		flowers.add(new FlowerEntity(1005,"致青春-无声的爱",1000,219.0,"2016-12-18","张欣雨","我爱你，胜过爱爱情，更胜过爱自己！"));
		flowers.add(new FlowerEntity(1006,"爱之寓言-郁金香",2500,666.6,"2016-12-24","张三","满山遍地郁金香"));
		flowers.add(new FlowerEntity(1007,"天生丽质-红山茶",3100,584.5,"2016-12-26","李四",""));
		flowers.add(new FlowerEntity(1008,"伟大母爱-康乃馨",4600,95.5,"2016-12-29","王五","母亲最伟大"));
	} 
	//获取所有鲜花订单对象
	public List<FlowerEntity> getFlowers(){
		return flowers;
	}
}
