package com.technoelevate.staticdefault;

public class Hello {

	public static void main(String[] args) {
		PhoneCall call = new TamilNadu();
		PhoneCall  call1 = new Maharastra();
		
		call.busyMsg();
		call1.busyMsg();
		
		System.out.println("--------");
		call.covidAlart();
		call1.covidAlart();
		
		}
	}


