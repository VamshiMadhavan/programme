package com.technoelevte.string;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Thalapola varuma";
		char[] c = a.toCharArray();
		String rev = "";
		for (int i = 0; i < c.length; i++) {
			rev = c[i]+ rev ;
		}
		System.out.println(rev);
	}

}
