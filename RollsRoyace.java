package com.technoelevate.loosecoupling;

public class RollsRoyace implements Car{

	@Override
	public void start() {		
		System.out.println("starts.........");
	}

	@Override
	public void accelarate() {
		System.out.println("accelarates..........");
	}

	@Override
	public void brake() {
		System.out.println("break............");
	}

}
