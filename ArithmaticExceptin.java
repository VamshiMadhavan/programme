package com.technoelevate.exception;

public class ArithmaticExceptin {

	public static void main(String[] args) {
		int x=10,y=0;//Arithmatic exception
		int z;
		try {
			z = x/y;
			System.out.println(z);
		} catch (Exception e) {
		 System.out.println("infinite");
		}
	
		
	}

}
