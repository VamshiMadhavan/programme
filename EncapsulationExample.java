package com.technoelevate.encapsulation;

public class EncapsulationExample {
	private int empId;
	private String name;
	private String designation;
	private int age;
	public void setAge(int age)
	{
		this.age = age;
	}
	public void getAge()
	{
		System.out.println(age);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void getName()
	{
		System.out.println(name);
	}
	public void setDesignation(String designation)
	{
		this.designation = designation ;
	}
	public void getDesignation()
	{
		System.out.println(designation);
	}
	public void setEmpId(int empId )
	{
		this.empId = empId;
	}
	public void getEmpId()
	{
		System.out.println(empId);
	}
	

	public static void main(String[] args) {
		EncapsulationExample e = new EncapsulationExample();
		System.out.println("The details of employee1 is");
		e.setAge(23);
		e.setDesignation("Assosiate SoftWare Eng..");
		e.setName("siddhu");
	    e.setEmpId(3456);
	    e.getAge();  
	    e.getDesignation();
	    e.getEmpId();
	    e.getName();
	    System.out.println("----------------------------");
	    EncapsulationExample e1 = new EncapsulationExample();
	    System.out.println("The details of employee2 is");
	    e1.setAge(23);
		e1.setDesignation("Assosiate SoftWare Eng..");
		e1.setName("sanjana");
	    e1.setEmpId(3457);
	    e1.getAge();
	    e1.getDesignation();
	    e1.getEmpId();
	    e1.getName();

	}

}
