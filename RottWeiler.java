package com.technoelevate.abstractClass;

public class RottWeiler extends Dog {

	public RottWeiler(double weight, int nails, String breed) {
		super(weight, nails, breed);
		}

	@Override
	public void eat() {	
		System.out.println("chicken");
	}

	@Override
	public void bark() {	
		System.out.println("wow wow...");
	}

	@Override
	public void bite() {	
		System.out.println("bites...");
	}

	
}
