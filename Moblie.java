package com.technoelevate.singlelevel;

public class Moblie {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "nokia";
		p.color = "black";
		p.cost = 800;
		p.sim = 1;
		System.out.println("the brand is "+" "+p.brand +"the color is  "+" "+p.color+"the cost is "+" "+p.cost+"the no. of sim accepted is "+" "+p.sim);
		p.call();
		p.text();
		SmartPhone s = new SmartPhone();
		s.brand = "ONEPLUS";
		s.color = "black";
		s.cost = 50000;
		s.sim = 2;
		s.ram = 4;
		s.rom = 264;
		System.out.println(p.brand +" "+p.color+" "+p.cost+" "+p.sim);
		s.call();
		s.text();
		s.takeSelfi();
		s.surffing();
		s.playPubg();
		

	}

}
