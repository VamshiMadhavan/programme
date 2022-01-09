package com.technoelevate.foreachmethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(2,3,4,5,6,7,8);
		System.out.println("---foreachmethod---");
		a.forEach(System.out::println);
		System.out.println("---Iterator---");
		Iterator<Integer> iterator = a.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---foreachloop---");
		for(int i : a) {
			System.out.println(a);
		}
		System.out.println("---forloop---");
		for (int i = 0; i <a.size(); i++) {
			System.out.println(i);
			
		}
		
	}

}
