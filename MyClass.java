package com.technoelevate.lambdaexp;

public class MyClass {

	public static void main(String[] args) {
//		Test t = new Test() {
//			@Override
//			public void msg() {
//				System.out.println("hello guys.....");
//				
//			}
//		};
//		t.msg();
//		System.out.println("------------------------------------");
//		//ananymous class
//		Test t1 = (i,j)-> {
//			
//			System.out.println(i+j");
//			
//				
//			
//		};
//		t1.msg();
		Runnable r=() ->{
			for (int i = 0; i <6; i++) {
				System.out.println(i);
				
			}
			
		};
		Thread t = new Thread(r);
		t.start();

		}}
	
	
	


