package com.technoelevte.threadingdemo;

import java.io.IOException;

public class Demo extends Thread {
	@Override
	public void run() {
		for (int i = 11; i < 20; i++) {
//			if(i==5) {
//				throw new ArithmeticException();
//			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

}
