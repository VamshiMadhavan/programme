package com.te.singleton;

public class User {

	public static void main(String[] args) {
		WhatsApp user1 = WhatsApp.helperMethod();
		System.out.println(user1);
		WhatsApp user2 = WhatsApp.helperMethod();
		System.out.println(user2);
		/* by default spring follows singleton designprocess 
		 * if we specify the scope is prototype then it creates multiple object
		 */

	}

}
