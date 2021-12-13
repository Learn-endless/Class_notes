package com.j2se.bridge;
/**
 * 高铁过桥子任务
 * @author Administrator
 *
 */
public class GaoTieTask implements Runnable {
	private Bridge bridge;  //共享资源：长江大桥
	
	public GaoTieTask(Bridge bridge){
		this.setBridge(bridge);
	}
	
	@Override
	public void run() {
		bridge.GaoTie();    //使用共享资源：过桥
	}

	public Bridge getBridge() {
		return bridge;
	}

	public void setBridge(Bridge bridge) {
		this.bridge = bridge;
	}

}
