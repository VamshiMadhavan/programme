package com.technoelevte.synchronization;

public class Account {
	int balance;

   	public Account(int balance) {
		super();
		this.balance = balance;
	}

	synchronized public void deposite(int amount) {
		// to avoid confusion making method as synchronized
		balance += amount;
	}

	public void withDraw(int amount) {
		if (amount > balance) {
			System.out.println("insufficient fund");
		} else {
			balance -= amount;
		}
	}

	public void checkBalance() {
		System.out.println(balance);
	}

}
