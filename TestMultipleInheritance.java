package com.technoelevate.multipleinheritance;

public class TestMultipleInheritance {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.eat();
		d.bark();
		c.meow();
		d.eat();
		
	}

}
