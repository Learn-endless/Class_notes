package com.j2se.bridge;
/**
 * ��������������
 * @author Administrator
 *
 */
public class GaoTieTask implements Runnable {
	private Bridge bridge;  //������Դ����������
	
	public GaoTieTask(Bridge bridge){
		this.setBridge(bridge);
	}
	
	@Override
	public void run() {
		bridge.GaoTie();    //ʹ�ù�����Դ������
	}

	public Bridge getBridge() {
		return bridge;
	}

	public void setBridge(Bridge bridge) {
		this.bridge = bridge;
	}

}
