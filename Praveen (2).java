package com.technoelevate.springbean1;

public class Praveen implements Animal {

	@Override
	public void makeShound() {
		System.out.println("haaaa");
	}

	@Override
	public void eat() {
		System.out.println("rice");
	}

	@Override
	public boolean isPet() {
		return false;
	}

}
