package com.technoelevatemethodoverriding;

public class Test1 extends Test {
	public void m1()
	{
		super.m1();
		System.out.println("from Test1");
	}
	public static void m3()
	{
		System.out.println("static from test1");
	}
	
	public  void m2()
	{
		System.out.println("static from test1");
	}

}
//this => current obj 
//super => superclass obj