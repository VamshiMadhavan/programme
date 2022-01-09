package com.technoelevate.array;

import java.util.Arrays;

public class RemoveDuplicate  {
	public static void main(String[] args) {
		removeDup(new int[] {2,2,2,3,4,3,5,4,6});
		
	}

	private static void removeDup(int[] a) {
		int x = a.length;
		for (int i = 0; i < x; i++) {
			for (int j = i+1; j <x; j++) {
				if(a[i]==a[j])
				{
					a[j]=a[x-1];
					x--;
				}	
			}
		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println(" ");
//		int temp =0;
//		for (int i = 0; i < b.length; i++) {
//			for (int j = i+1; j < b.length; j++) {
//				if(b[i]>b[j])
//				{
//					temp =b[i];
//					b[i]=b[j];
//					b[j]=temp;
//				}
//			}
//			System.out.print(b[i]+" ");
//		}
//	}
}}

	