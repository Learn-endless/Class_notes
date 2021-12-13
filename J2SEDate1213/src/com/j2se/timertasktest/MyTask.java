package com.j2se.timertasktest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask{

	@Override
	public void run() {
		//获取当前时间
		Date date = new Date();
//		LocalDateTime localDateTime = LocalDateTime.now(); //这是个静态方法
//		DateTimeFormatter
		//日期转换格式
		SimpleDateFormat pf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String str = pf.format(date);
		System.out.println(str);
	}

}
