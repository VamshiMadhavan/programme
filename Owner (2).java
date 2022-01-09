package com.te.factorym;

import java.util.Scanner;

public class Owner {

	public static void main(String[] args) {
		while(true) {
			Driver driver = new Driver();
			System.out.println("--------------------------------------------");
			System.out.println("boss tell me the bike to bring??");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			if(s.equalsIgnoreCase("no")) {
				System.out.println("ok boss!!!!!!!!");
				break;
			}
			driver.drive(s);
		}

	}

}
