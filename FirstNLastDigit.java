package com.technoelevate.challenge;

import java.util.Scanner;

public class FirstNLastDigit {
	
	static int sumFirstAndLastDigit(int n) {
		int sum=0;
		int f=0;
		if(n>=10) {
			int l = n%10;
			while(n>=10) {
				n/=10;
				 f=n;
			}
			 sum = f+l;
			 return sum;
		}
		return -1;	
	}

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(sumFirstAndLastDigit(n));
	}

}
