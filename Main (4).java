package com.technoelevate.methodref;

public class Main {
	void method1() {
		System.out.println("method1");
	}
	
	void method2() {
		System.out.println("method2");
	}

	public static void main(String[] args) {
		PracticeImpl p =new  Main()::method2;
		p.Method();

	}

}
