package com.technoelevate.hasetimple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ClassRoom {
	public static void main(String[] args) {
		Student student = new Student(1, "siddhu", 100);
		Student student1 = new Student(2, "sanjana", 99);
		Student student2 = new Student(3, "praveen", 35);
		Student student3 = new Student(4, "Mahadev", 70);
		HashSet<Student> h = new HashSet<Student>();
		h.add(student);
		h.add(student1);
		h.add(student2);
		h.add(student3);
		h.forEach(System.out::println);
		
		
		Iterator<Student> iterator = h.iterator(); while(iterator.hasNext()) {
		 System.out.println(iterator.next()); }
		 
		System.out.println("-------------------------");
		ArrayList<Student> a = new ArrayList<>(h);
		//Collections.sort(arrayList, new SortByName());
		Collections.sort(a, new SortByMarks());
		Iterator<Student> iterator2 = a.iterator();
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());	
			
		}
	}

}
