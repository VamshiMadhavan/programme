package com.technoelevate.abstractClass;

public class PitBull extends Dog {

	public PitBull(double weight, int nails, String breed) {
		super(weight, nails, breed);
		}

	@Override
	public void eat() {
		System.out.println("mutton and chicken");
	}

	@Override
	public void bark() {
		System.out.println("lol lol.....");
	}

	@Override
	public void bite() {
		System.out.println("bites......");
		
	}

}
