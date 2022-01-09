package com.technoelevate.unary;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		int x =10;
		
		//x=x++;
		x= ++x;
		System.out.println(x);
		int a = 10;
		int b = a++;
		System.out.println(b);
		a = ++a;
		System.out.println(~a);
		System.out.println(~~a);
		System.out.println(~~~a);
		boolean c = false;
		int d = -2;
		System.out.println(!c);
		System.out.println(~~d);
		System.out.println(~~~d);
		System.out.println(~~~~d);
		
	}

}
