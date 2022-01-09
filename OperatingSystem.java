package com.technoelevate.hasarelation;

public class OperatingSystem {
	String brand;
	String version;
	double bit;
	public OperatingSystem(String brand, String version, double bit) {
		super();
		this.brand = brand;
		this.version = version;
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "OperatingSystem [brand=" + brand + ", version=" + version + ", bit=" + bit + "]";
	}
	
	
	

}
