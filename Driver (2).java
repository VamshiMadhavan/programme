package com.te.factorym;

import java.util.Scanner;

public class Driver {
	
	void drive(String s) {
		
	    if(s.equalsIgnoreCase("ktm")) {
	    	Bike b = new Ktm();
	    	b.start();
	    	b.move();
	    	b.stop();
	    }
	    
	    if(s.equalsIgnoreCase("apache")) {
	    	Bike b1 = new Apache();
	    	b1.start();
	    	b1.move();
	    	b1.stop();
	    }
	    
	    
	    
	}

}
