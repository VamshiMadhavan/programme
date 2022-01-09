package com.technoelevate.assignment;

public class AssgtOperator {

	public static void main(String[] args) {
		int a = 10;
		int m = 11;
		a +=1;
		a*=3;
		a/=11;
		int n =10;
		
		
		
//		int c = 2;
//		int d = 3;
//		System.out.println((c++>d && ++c>d));//false
//		System.out.println(c);//3
		//System.out.println(d);//3
		
		//int e = 3;
		//int f = 3;
		//System.out.println((e++>f && ++e>f));//false
		//System.out.println(e);//4
		//System.out.println(f);//3
		
		//int e = 3;
		//int f = 3;
		//System.out.println((e++>=f && ++e>f));//true
		//System.out.println(e);//5
		//System.out.println(f);//3
		
		//int e = 4;
		//int f = 3;
		//System.out.println((e++>f && ++e>f));//true
		//System.out.println(e);//6
		//System.out.println(f);//3
		int e = 4;
    	int f = 6;
		System.out.println((++e>=f || ++e<=f));//true
		System.out.println(e);//6
		System.out.println(f);//3
		}

}
