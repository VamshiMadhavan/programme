package com.technoelevate.array;

import java.util.Scanner;

public class AnanymousArray {

	public static void main(String[] args) {
		System.out.println("the sum of array is " +sum(new int[] {1,2,3,4,5,6}));
	}

	public static int sum(int[] a) {
		int total = 0;
		for(int x : a)
		{
			total = total + x;
		}
		return total;
	}

}
