package com.te.spring.autowire;

public class Laptop {
	Battery b;
	Battery b1;
	Screen c;
	public void setB(Battery b) {
		this.b = b;
	}
	public void setC(Screen c) {
		this.c = c;
	}
	
	public void setB1(Battery b1) {
		this.b1 = b1;
	}
	
	
	public Laptop(Battery b, Battery b1, Screen c) {
		super();
		this.b = b;
		this.b1 = b1;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Laptop [b=" + b + ", b1=" + b1 + ", c=" + c + "]";
	}
	

}
