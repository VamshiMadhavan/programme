package com.technoelevate.methodref;

public class MyClass {
	void sum(int x,int y) {
		System.out.println(x+y);
	}
	static void sub(int x,int y) {
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
//		Test t = new MyClass()::sum;
//		t.add(5, 7);
		Test t = MyClass::sub;
		t.add(5, 2);
		
		
	}

}
