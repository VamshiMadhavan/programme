package com.te.prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Garden {
	public static void main(String[] args) {
		
		List<Dog> list = Arrays.asList(new Dog("c", "pitbull", 70, "meat"),
				new Dog("d", "Golden retriver", 50, "pedgree"),
				new Dog("a", "beagle", 25, "roti"),
				new Dog("b", "rotweiler", 65, "chicken")
				);
		System.out.println(list);
		System.out.println("----------------");
		
		for(Dog s : list) {
			System.out.println(s);
		}
		System.out.println("----------------");
		Collections.sort(list, new SortbyName());
		
		for(Dog s : list) {
			System.out.println(s);
		}
	}
	
	
		
		
		
		
		

}
