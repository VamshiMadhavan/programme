package com.technoelevte.threadingdemo;

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.run();
		Demo2 demo2 = new Demo2();
		demo.setPriority(1);//lowestpriority
		demo2.setPriority(10);//highestpriority i.e..starts from 0
		demo.start();
		demo2.start();
//		for (int i = 11; i < 20; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
