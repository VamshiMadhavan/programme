// Java Program to demonstrate merging
// two array without using pre-defined method

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Insert {
	public static void main(String[] args)
	
	{   
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr1[] = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int n = sc.nextInt();
		int arr2[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=sc.nextInt();
		}
		
		int a = arr1.length;
		int b = arr2.length;
		int c = a+b;
		int in[] = new int[c];
		for (int i = 0; i < a; i++) {
			 in[i] = arr1[i];
		}
		for (int i = 0; i < b; i++) {
			in[a+i]=arr2[i];
		}
		System.out.println(Arrays.toString(in));
		
		}}