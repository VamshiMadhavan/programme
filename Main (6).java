package com.technoelevate.compilepolymorphism;

public class Main {

	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		fc.firstMethod();
		System.out.println("----------------------");//binding takes place @ compiletime
		SecondClass sc = new SecondClass();
		sc.firstMethod();
		
		
	}

}
