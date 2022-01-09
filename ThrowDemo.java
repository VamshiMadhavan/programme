package com.technoelevate.throw1;

public class ThrowDemo {
	public void  bushan() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		System.out.println("I didt do it");
		//throw new ArrayIndexOutOfBoundsException();
		//throw new Exception();
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("who has done it");
		ThrowDemo t = new ThrowDemo();
		System.out.println("---------------------------------");
//		try {
//			t.bushan();
//		} catch (Exception e) {
//			System.out.println("error occured");
//		}
		try {
			t.bushan();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("yeshoda doubt");
			
		}
	}
}

