package com.technoelevate.thread;

public class Demo2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i <26; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
