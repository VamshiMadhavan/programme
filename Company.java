package com.technoelevate.arralistdemo;

import java.util.ArrayList;
import java.util.Collections;

import com.technoelevate.arrlst.MyArrList;

public class Company {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList();
		Employee e1 = new Employee(4, "vamshi", 100000);
		a.add(new Employee(1, "sanjana", 10000));
		a.add(new Employee(2, "praveen", 1000000));
		a.add(new Employee(3, "vivek", 10000));
		a.add(2,e1 );
		a.set(2, new Employee(7, "Dhoni", 100000));//replace value
		for(Employee e: a)
		{
			System.out.println(e);
		}
		Collections.sort(a);
		
		System.out.println("---------------------------");
		for(Employee e: a)
		{
			System.out.println(e);
		}
		//Collections.sort(a, new SortBySalary());
		System.out.println("---------------------------");
		Collections.sort(a, new SortById());
		for(Employee e: a)
		{
			System.out.println(e);
		}
		Collections.sort(a, new SortBySalary());
		System.out.println("-------------byname using comparable--------------");
		Collections.sort(a);
		for(Employee e: a)
		{
			System.out.println(e);
		}
		System.out.println("-------------byname using comparator--------------");
		Collections.sort(a);
		for(Employee e: a)
		{
			System.out.println(e);
		}
	}

}
