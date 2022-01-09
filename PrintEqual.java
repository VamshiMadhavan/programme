package com.technoelevate.challenge;

public class PrintEqual {
	int number1;
	int number2;
	int number3;
	
	public PrintEqual(int number1, int number2, int number3) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	
	static void printEqual(int number1,int number2,int number3) {
		if(number1==number2 && number1==number3 ||  number2==number3 ) {
			System.out.println("equal");	
		}else if(number1!=number2 && number1!=number3 ||  number2!=number3 ) {
			System.out.println("different");	
		}else {
			System.out.println("neither equal nor different");
			
		}
		
		
	}



	public static void main(String[] args) {
		printEqual(5, 6, 5);
		
	}

}
