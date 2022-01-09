package com.te.factorym;

public class Apache implements Bike {

	@Override
	public void start() {
		System.out.println("Apache bike started");
		
	}

	@Override
	public void move() {
		System.out.println("Apache bike moved");		
	}

	@Override
	public void stop() {
		System.out.println("Apache bike stoped");		
	}

}
