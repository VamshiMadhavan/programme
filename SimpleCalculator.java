package com.technoelevate.challenge;

public class SimpleCalculator {
	 double firstNumber;
	 double secondNumber;

	public SimpleCalculator() {

	}

	

    public SimpleCalculator(double firstNumber, double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}



	double setFirstNumber(double firstNumber) {
		return this.firstNumber = firstNumber;
	}

	double setSecondNumber(double secondNumber) {
		return this.secondNumber = secondNumber;
	}

	double getFirstNumber(double firstNumber) {
		return firstNumber;
	}

	double getSecondNumber(double secondNumber) {
		return secondNumber;
	}

	 double getAddition() {
		return getFirstNumber(firstNumber) + getSecondNumber(secondNumber);
	}

	double getSubtraction() {
		return getFirstNumber(firstNumber) - getSecondNumber(secondNumber);
	}

	double getDivision() {
		return getFirstNumber(firstNumber) / getSecondNumber(secondNumber);
	}

	double getMultipication() {
		return getFirstNumber(firstNumber) * getSecondNumber(secondNumber);
	}

	public static void main(String[] args) {
		
		SimpleCalculator simpleCalculator = new SimpleCalculator(5,2);
		System.out.println("the sum of two digits:"+simpleCalculator.getAddition());
		System.out.println("the sub of two digits:"+simpleCalculator.getSubtraction());
		System.out.println("the multiplication of two digits:"+simpleCalculator.getMultipication());
		System.out.println("the division of two digits:"+simpleCalculator.getDivision());
		
	}

}
