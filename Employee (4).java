package com.technoelevate.hibernate2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	int age;
	double salary;
	
	

}
