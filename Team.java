package com.technoelevate.hibernate;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	private int id;
	//@Column(name="firstname")
	private String name;
	private double salary;
	private String designation;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) ==> to auto increment the id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	

	
	

}
