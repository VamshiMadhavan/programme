package com.technoelevate.challenge;

import java.util.Scanner;

public class ComplexNumber {
	double real;
	double imaginary;
	
	public ComplexNumber() {
	}
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	double getReal() {
		return real;
	}
	
	double getImginary() {
		return imaginary;
	}
	
	void add(double real, double imaginary) {
		System.out.println(this.real+"+ i"+this.imaginary);
	}



	public static void main(String[] args) {
		Scanner s =new  Scanner(System.in);
		double m = s.nextDouble();
		double n = s.nextDouble();
		ComplexNumber complexNumber = new ComplexNumber(m,n);
		complexNumber.add(m,n);
	}

}
