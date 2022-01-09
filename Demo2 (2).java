package com.technoelevte.threadingdemo;

public class Demo2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
//			if (i == 5) {
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
