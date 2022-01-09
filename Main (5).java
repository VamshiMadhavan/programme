package com.technoelevatemethodoverriding;

public class Main {

	public static void main(String[] args) {
//		Test1 t1 = new Test1();
//		t1.m1();
//		Test1.m2();
//		t1.m2();
		Test t = new Test1();//upcasting
		t.m1();
		Test1 t2 = (Test1) t;//downcasting
		t2.m1();
		t2.m3();
	}

}
