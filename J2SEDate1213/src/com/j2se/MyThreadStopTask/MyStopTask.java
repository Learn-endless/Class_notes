package com.j2se.MyThreadStopTask;

public class MyStopTask implements Runnable{

	private boolean flag = true;
	
	public MyStopTask(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public void run() {
		for (int i = 0; flag; i++) {
			if(i % 100000 == 0){
				System.out.println(i);
			}
		}
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
 
}
