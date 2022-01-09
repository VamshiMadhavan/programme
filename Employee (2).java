package com.technoelevate.streamapi;

public class Employee {
	int employeeId;
	String name;
	int age;
	double salary;
	String designation;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int employeeId, String name, int age, double salary, String designation) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", designation=" + designation + "]";
	}
	
	
	

}
