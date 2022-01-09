package com.technoelevate.springbean1;

public class Dog implements Animal {

	@Override
	public void makeShound() {
		System.out.println("dog:bow bow");
	}

	@Override
	public void eat() {
		System.out.println("eats pedegiree");
		
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
