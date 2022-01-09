package com.technoelevate.exception;

public class StactOverflow {

	public static void main(String[] args) {
		m1();
	}

	 static void m1() {
		 System.out.println("from m1");
		 m1();
	}

}
