package com.technoelevate.springbean1;

public class Cat implements Animal {

	@Override
	public void makeShound() {
		System.out.println("car:meow meow");
		
	}

	@Override
	public void eat() {
		System.out.println("milk");
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
