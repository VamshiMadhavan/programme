package com.technoelevate.staticdefault;

public interface PhoneCall {
	
	 void busyMsg();
	  default void  covidAlart() {
		  System.out.println("amithab saying be safe");
	  }
		
	
	

}
