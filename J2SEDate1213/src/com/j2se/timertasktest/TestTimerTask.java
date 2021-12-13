package com.j2se.timertasktest;

import java.util.Timer;

public class TestTimerTask {
	public static void main(String[] args) {
		MyTask t = new MyTask();
		
		Timer ret = new Timer();
		//参数一：定时任务对象
		//参数二：表示延迟多长时间执行
		//参数三：定时任务的执行周期
		ret.schedule(t, 1000, 5000);
	}
}
