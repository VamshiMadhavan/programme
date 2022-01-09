package com.technoelevte.synchronization;

public class GirlFriend extends Thread {
	Account account;

	public GirlFriend(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.deposite(10);
		}
		System.out.println("girlFriend Transaction over");
	}
	

}
