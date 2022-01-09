package com.technoelevte.synchronization;

public class Main {

	public static void main(String[] args) throws Exception {
		Account account = new Account(1000);
		GirlFriend girlFriend = new GirlFriend(account);
		BoyFriend boyFriend = new BoyFriend(account);
		boyFriend.start();
		girlFriend.start();
		
		boyFriend.join();
		girlFriend.join();
		
		System.out.println("wait over");
		account.checkBalance();
	}

}
