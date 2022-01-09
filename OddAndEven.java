package com.technoelevate.challenge;

import java.util.Scanner;

public class OddAndEven {
	
	static boolean isOdd(int n){
		if(n%2==0) {
			return false;
		}
		return true;
		
	}
	
	static int sumOdd(int m,int n) {
		int sum =0;
		if(m>0 && n>0) {
			for (int i = m; i <= n; i++) {
				if(i%2!=0) {
					sum = sum+i;	
				}
			}
			return sum;
		}
		return -1;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		System.out.println("the number"+n+"is "+isOdd(n));
		if(isOdd(n)) {
			System.out.println(n+" is odd");
		}
		System.out.println("enter the range:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sumOdd(a, b));
		
		
	}

}
