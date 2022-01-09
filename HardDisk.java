package com.technoelevate.hasarelation;

public class HardDisk {
	String brand;
	double size;
	String type;
	public HardDisk(String brand, double size, String type) {
		super();
		this.brand = brand;
		this.size = size;
		this.type = type;
	}
	@Override
	public String toString() {
		return "HardDisk [brand=" + brand + ", size=" + size + ", type=" + type + "]";
	}
	

}
