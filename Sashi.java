package com.technoelevate.sync;

public class Sashi extends Thread {
         Printer printer;

	

	public Sashi() {
		super();
	
	}



	@Override
	synchronized public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Pages:"+i);
			
			
		}
		
	}

}
