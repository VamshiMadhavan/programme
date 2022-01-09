package com.te.factorym;

public class Ktm implements Bike {

	@Override
	public void start() {
		System.out.println("ktm bike started");
	}

	@Override
	public void move() {
		System.out.println("ktm bike moved");
	}

	@Override
	public void stop() {
		System.out.println("ktm bike stoped");		
	}

}
