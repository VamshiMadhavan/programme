package com.technoelevate.springbeanclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.technoelevate.springbean1.Cat;
import com.technoelevate.springbean1.Dog;
import com.technoelevate.springbean1.Pet;
import com.technoelevate.springbean1.Praveen;
@Configuration
public class Config {
	
	@Bean
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean
	public Praveen getPraveen() {
		return new Praveen();
	}
	
	@Bean
	public Pet getPet() {
		return new Pet();
		
	}

}
