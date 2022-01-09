package com.technoelevate.sync;

public class Praveen extends Thread {
	Printer printer;

	public Praveen() {
		super();
		
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println("pages:"+i);
		}

	}
}
