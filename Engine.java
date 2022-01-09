package com.technoelevate.spring;

public class Engine implements Garage {
	String brand;
	double cap;
	
//	public Engine(String brand, double cap) {
//		super();
//		this.brand = brand;
//		this.cap = cap;
//	}
//


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCap(double cap) {
		this.cap = cap;
	}




	@Override
	public void start() {
		System.out.println(brand+" engine has started and it has"+cap+"capacity");
		
	}

	

}
