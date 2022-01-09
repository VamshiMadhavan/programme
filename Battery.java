package com.technoelevate.hasarelation;

public class Battery {
	String brand;
	double mAh;
	int volt;
	public Battery(String brand, double mAh, int volt) {
		super();
		this.brand = brand;
		this.mAh = mAh;
		this.volt = volt;
	}
	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", mAh=" + mAh + ", volt=" + volt + "]";
	}

}
