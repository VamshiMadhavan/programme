package com.technoelevate.challenge;

import java.util.Scanner;

public class Clock {
	static int hour;
	
	public Clock(int hour) {
		super();
		this.hour = hour;
	}
	
	public static void getDuration(int min , int sec) {
		if(min>=0 && (sec>=0 && sec>=59)) {
			hour = min/60;
			min = min%60;
			System.out.println(hour+"h:"+min+"m:"+sec+"s");
		}
		
		else {
			System.out.println("invalid");
		}
		
	}
	
	public static  void getDuration(int sec) {
		if(sec>=0) {
			sec = sec/60;
			System.out.println(sec+"mins");
		}	
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many mins:");
		int m = sc.nextInt();
		System.out.println("enter how many sec:");
		int s = sc.nextInt();
		getDuration(m, s);
		getDuration(s);
	}

}
