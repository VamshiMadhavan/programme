package com.technoelevate.challenge;

import java.util.Scanner;

public class AreaRec {
	double length;
	double width;
	
	public AreaRec(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	static double area(double length, double width) {
		if(length>0 && width>0) {
			return length*width;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Length:");
		double n = sc.nextDouble();
		System.out.println("enter the Width:");
		double m = sc.nextDouble();
		System.out.println(area(n,m));
	}
	
	

}
