package com.technoelevte.string;

public class Sorting {

	public static void main(String[] args) {
		String a1 = "bmghfgbxm";
		char a[] = a1.toCharArray();
		
		char temp = '0';
		int b =0;
		int t[]=new int[b];
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----");
		
	}

}
