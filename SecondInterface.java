package com.technoelevate.interface1;

public interface SecondInterface {
	void method();
	default void m1()
	{
		System.out.println("m1");
	}
	default void method2()
	{
		System.out.println("default method1 from second");
	}
	static void method3()
	{
		System.out.println("static method2");
	}
}
