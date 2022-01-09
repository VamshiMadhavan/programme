package com.technoelevate.sync;

public class Main {

	public static void main(String[] args) throws  InterruptedException {
		Sashi sashi = new Sashi();
		Praveen praveen = new Praveen();
		sashi.start();
		praveen.start();
		sashi.join();
		
	}

}
