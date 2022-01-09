package com.technoelevate.challenge;

import java.util.Scanner;

public class AreaCir {
	double radius;

	public AreaCir(double radius) {
		super();
		this.radius = radius;
	}

	static double area(double radius) {
		if (radius > 0) {
			return Math.PI * (radius * radius);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius:");
		double n = sc.nextDouble();
		System.out.println(area(n));
	}

}
