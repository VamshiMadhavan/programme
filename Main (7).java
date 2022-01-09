package com.technoelevate.runtimepoly;

public class Main {

	public static void main(String[] args) {
		FirstClass fc = new SecondClass();
		fc.firstMethod();//method binding takes place @ runtime
		System.out.println(fc.x);
	}

}
