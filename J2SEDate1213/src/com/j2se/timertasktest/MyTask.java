package com.j2se.timertasktest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask{

	@Override
	public void run() {
		//��ȡ��ǰʱ��
		Date date = new Date();
//		LocalDateTime localDateTime = LocalDateTime.now(); //���Ǹ���̬����
//		DateTimeFormatter
		//����ת����ʽ
		SimpleDateFormat pf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		String str = pf.format(date);
		System.out.println(str);
	}

}
