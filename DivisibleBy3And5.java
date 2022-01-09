package com.technoelevate.challenge;

import java.util.Scanner;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter i/p:");
		int n = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				count++;
				if (count == 5) {
					break;
				}
			}

		}

	}

}
