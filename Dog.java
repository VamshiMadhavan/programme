package com.technoelevate.abstractClass;

abstract public class Dog {
	double weight;
	int nails;
	String breed;
	public abstract void eat();
	public abstract void bark();
	public abstract void bite();
	public  void poop()
	{
		System.out.println("pooping");
	}
	public Dog(double weight, int nails, String breed) {
		this.weight = weight;
		this.nails = nails;
		this.breed = breed;
		
	}
	
//obj can't be created & constructor can be created.
	
}
