package com.technoelevate.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(101, "vijay", 50, 100000,"Developer"),
				                            new Employee(102, "Ajith", 40, 1000000,"MD"),
				                            new Employee(103, "Dhanush",49, 10000,"tester"),
				                            new Employee(104, "Simbu", 47, 10000,"Developer"),
				                            new Employee(105, "vijaySethu", 47, 1000,"tester"),
				                            new Employee(106, "vijayAntony", 46, 100,"Developer"),
				                            new Employee(107, "Atharva", 20, 500,"tester"),
				                            new Employee(108, "Aarya", 30, 600,"tester"),
				                            new Employee(109, "surya", 40, 700,"Developer")
				                       );
		Employee e = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(e.getAge()>list.get(i).getAge()) {
				e=list.get(i);
			}	
		}
		System.out.println(e);
		System.out.println("---------------------------------------------");
		
		Stream<Employee> stream = list.stream();
		Optional<Employee> min = stream.min(Comparator.comparing(Employee::getAge));
		System.out.println(min);
		
		System.out.println("---------------------------------------------");
		
		list.stream().max(Comparator.comparing(Employee :: getAge)).ifPresent(System.out::println);
		
		System.out.println("-------------------sortbyname--------------------------");
		
		//sorting
		
		List<Employee> list2 = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println("------------------sortbysalary---------------------------");
		
		List<Employee> list3 = list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		list3.forEach(System.out::println);
		
		System.out.println("------------------------groupbydept-----------------------------");
		Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		collect.forEach((department, emp)->{
			System.out.println(department);
			emp.forEach(System.out::println);
		});
		System.out.println("----------------------filterbyage---------------------------");
		List<Employee> collect2 = list.stream().filter(emp->emp.getAge()>23).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		System.out.println("---------------------filterbysal-------------------------------------");
		List<Employee> collect3 = list.stream().filter(emp->emp.getSalary()>1000).collect(Collectors.toList());
		collect3.forEach(System.out::println);
	}

}
