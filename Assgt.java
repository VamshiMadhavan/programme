package com.technoelevate.array;

import java.util.Scanner;

public class Assgt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
		 a[i]=sc.nextInt();	
		}
		repeated(a);
	}

	private static void repeated(int[] a) {
		int x=a.length;
		int count =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j] )
				{
					count++;
				}
			}	
		}
		System.out.println(count==3);
		
	}

}
