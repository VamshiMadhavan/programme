package com.technoelevate.hasetimple;

import java.util.Objects;

public class Student {
	int rollNumber;
	String name;
	int marks;

	public Student(int rollNumber, String name, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return rollNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.rollNumber == obj.hashCode()) {
		return false;
	}
		return true;
	

	}}
