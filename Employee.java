package com.technoelevate.empcustomexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

   	public void equals(Employee e) throws Error {
		if (this.id == e.id) {
			throw new Error();
		} else {

		}
	}

   	public static void main(String[] args) {
		Employee e = new Employee(1, "Ajith", 10000);
		Employee e1 = new Employee(2, "Vijay", 10000);
		Employee e2 = new Employee(2, "Surya", 10000);
		Employee e3 = new Employee(4, "Dhanush", 10000);
		Employee e4 = new Employee(5, "Simbu", 10000);
		ArrayList<Employee> arrayList = new ArrayList<>();
		e.equals(e2);
		e.equals(e3);
		e.equals(e4);
		e1.equals(e);
		e1.equals(e);
		e1.equals(e2);
		e1.equals(e3);
		e1.equals(e4);
		e2.equals(e);
		e2.equals(e1);
		e2.equals(e3);
		e2.equals(e4);
		e3.equals(e);
		e3.equals(e1);
		e3.equals(e2);
		e3.equals(e4);
		e4.equals(e);
		e4.equals(e1);
		e4.equals(e2);
		e4.equals(e3);
	
		arrayList.add(e);
		arrayList.add(e1);
		arrayList.add(e2);
		arrayList.add(e3);
		arrayList.add(e4);
		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
