package com.lec.ex03_threadN_object1;
//������ N���� �۾���ü 1�� ����  - runnable�� �̿�
public class ThreadEx implements Runnable {
	private int num; //���� ���� ����
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			String threadName = Thread.currentThread().getName();
			if(threadName.equals("A")) {
				System.out.println("~ ~ ~ A ������ ~ ~ ~");
				num++;
			}
			System.out.println(threadName+"�� num = "+num);
				try {
					Thread.sleep(500);//0.5�� ���
				} catch (InterruptedException e) { }
		}//for
		
	}//main
	
}//class