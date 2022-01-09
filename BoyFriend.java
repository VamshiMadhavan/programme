package com.technoelevte.synchronization;

public class BoyFriend extends Thread {
	Account account;

	public BoyFriend(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.deposite(200);
		}
		System.out.println("boyFriend Transaction over");
	}

}
