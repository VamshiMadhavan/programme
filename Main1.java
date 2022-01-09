package com.technoelevate.arrlst;

import java.util.Iterator;

public class Main1 {

	public static void main(String[] args) {
		Practice practice = new Practice(6);
		practice.add(5);
		practice.add(34);
		practice.add(45);
		practice.add(56);
		practice.add(54);
		practice.add(23);
		practice.add(35);
		practice.add(26);
		System.out.println(practice);
		
		Iterator i = practice.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	

	}

}
