package com.technoelevate.methodoverloading;

public class MolChangPara {
	public static int add(int a,int b) {
		return (a+b);	
	}
	public static int add(int a,int b,int c) {
		return (a+b+c) ;	
	}

	public static void main(String[] args) {
		System.out.println(add(5,6,7));
		System.out.println(add(2,6));
		
	}

}
