package com.j2se.bridge;

/**
 * ��������������
 * @author Administrator
 *
 */
public class DongCheTask implements Runnable {
	private Bridge bridge;
	
	public DongCheTask(Bridge bridge){
		this.setBridge(bridge);
	}

	@Override
	public void run() {
		bridge.DongChe();
	}

	public Bridge getBridge() {
		return bridge;
	}

	public void setBridge(Bridge bridge) {
		this.bridge = bridge;
	}

}
