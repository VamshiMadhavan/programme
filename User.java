package com.technoelevate.abstractClass;

public class User {

	public static void main(String[] args) {
		RottWeiler rw = new RottWeiler(23.0, 20, "RottWeiler");
		System.out.println("------RottWeiler------");
		rw.bark();
		rw.bite();
		rw.eat();
		rw.poop();
		System.out.println(rw.breed);
		System.out.println(rw.nails);
		System.out.println(rw.weight);
		System.out.println("----------PitBull---------");
		PitBull p = new PitBull(45.0, 20, "PitBull");
		p.bark();
		p.bite();
		p.eat();
		p.poop();
		System.out.println(p.breed);
		System.out.println(p.nails);
		System.out.println(p.weight);
		System.out.println("----------GoldenRetriver---------");
		GoldenRetriver gr = new GoldenRetriver(55.0, 20, "GoldenRetriver");
		gr.bark();
		gr.bite();
		gr.eat();
		gr.poop();
		System.out.println(gr.breed);
		System.out.println(gr.nails);
		System.out.println(gr.weight);
	}

}
