package com.technoelevate.interfaceambiguity;

public class Test implements FirstInterface,SecondInterface {
	

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();

	}

	@Override
	public void m1() {
		System.out.println("from demo");
	}
	

}
