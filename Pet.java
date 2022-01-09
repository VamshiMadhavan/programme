package com.technoelevate.springbean1;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {
	
	String name;
	@Autowired
	 Animal animal;
	
	public void doThings() {
		if(animal.isPet()) {
			animal.eat();
			animal.makeShound();
		}
		else {
			System.out.println("this is not pet");
		}
	}

}
