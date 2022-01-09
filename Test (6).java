package com.technoelevte.string;

public class Test extends Object {

	public static void main(String[] args) {
		String name = "My name is praveen";
		String s = "praveen";
		System.out.println(name.equals(s));
		System.out.println("-------------------------");
		String name1 = new String("Mahadev");
		String name2 = new String("Mahadev");
		System.out.println(name1.equals(name2));
		System.out.println("-------------------------");
		System.out.println(name.charAt(1));
		System.out.println("---------------------------");
		name = name.toUpperCase();
		System.out.println(name);
		String s1[] =name.split(" " , 4);//just deleting space(' ') in a string array
		for (String x : s1) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		String s2[] =name.split("A" , 4);//just deleting & spliting 'A' in a string array
		for (String y : s2) {
			System.out.println(y);
		}
	}

}
