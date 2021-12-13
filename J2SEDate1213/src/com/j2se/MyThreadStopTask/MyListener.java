package com.j2se.MyThreadStopTask;

import java.util.TimerTask;
import java.io.File;
import java.util.Timer;

/**
 * 自定义的监听器，监听线程的运行
 * 步骤：
 * 1 启动线程，执行MyTask任务提
 * 2 启动定时任务和定时器
 * 3 每隔1000毫秒判断磁盘中有没有stop文件，如果有就停止线程的执行
 * @author Administrator
 *
 */
public class MyListener {
	public static void main(String[] args) {
		final MyStopTask n1 = new MyStopTask(true);
		Thread t1 = new Thread(n1);
		t1.start();
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				File file = new File("stop.txt");
				//exists方法判断是否存在stop.txt文件，存在为true，否则false
				if(file.exists()){
					n1.setFlag(false);  //给子任务的flag值为false
					file.delete();      //删除stop.txt文件
					timer.cancel();     //停止定时器
				}
			}
		}, 1000, 1000);
		
	}
}
