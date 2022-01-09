package com.technoelevte.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)//creates obj of calculator to acces inst method
class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeAll//exceutes before everthing
	public void beforeAll() {
		System.out.println("Before Everything");
	}

	@BeforeEach//executes before every method
	void init() {
		calculator= new Calculator();
		System.out.println("started");
	}
	
	@AfterEach
	void conclusion() {
		System.out.println("process ended");
	}

	@Test
	//@Disabled
	@DisplayName("ADDITION")
	void test() {
		int actual = Calculator.add(5, 2);
		int expected = 7;
		assertEquals(actual, expected);
		System.out.println("added");
	}
	
	@Test
	@DisplayName("Area")
	void test1() {
		double actual = Calculator.area(10);
		double expected =  314.159265358979323846;
		assertEquals(actual, expected,"area is over");
		System.out.println("area found");
	}
	
	@Test
	@DisplayName("multipliction")//displys name
	void test2() {
		assertEquals(4, Calculator.multipication(2, 2),"add method is filure");
		System.out.println("multiplied");
	}
	
	@Test
	void division() {
		assertThrows(ArithmeticException.class, ()->calculator.division(10,0));
	}
	
	

}
