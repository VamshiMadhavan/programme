package com.technoelevate.hasarelation;

public class Processor {
	String brand;
	double core;
	double speed;
	public Processor(String brand, double core, double speed) {
		this.brand = brand;
		this.core = core;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", core=" + core + ", speed=" + speed + "]";
	}
	


	

}
