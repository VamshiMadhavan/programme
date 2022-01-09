package com.technoelevate.hasetexample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
  	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<>();
		// System.out.println(hashset.add(10));true returntype is boolean for add()
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(90);
		h.add(50);
		h.add(60);
		System.out.println(h);
		System.out.println();
		h.clear();
		int a[]= {1,2,3,4,5};
		for(Integer i:a) {
			h.add(Integer.valueOf(i));
		}
		
		System.out.println(h);
		
		/*for (Object o : h) {
			System.out.println(o);
		}
		// HashSetDemo hashSetDemo = new HashSetDemo();//alt+shif+f=>coding convention
		System.out.println("-----------------------------");
		Iterator iterator = h.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
	}

}
