package com.technoelevate.loosecoupling;

public class Owner {

	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new Audi());
		System.out.println("------------------------------------");
		d.drive(new RollsRoyace());
	}

}
