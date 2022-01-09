package com.technoelevate.abstractClass;

public class GoldenRetriver extends Dog {

	public GoldenRetriver(double weight, int nails, String breed) {
		super(weight, nails, breed);
		
	}

	@Override
	public void eat() {
		System.out.println("biscuits");
	}

	@Override
	public void bark() {
		System.out.println("ba ba.....");
		
	}

	@Override
	public void bite() {
		System.out.println("bites.......");
	}
	

}
