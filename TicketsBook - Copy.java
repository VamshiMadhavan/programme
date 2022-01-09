package com.technoelevte.synchronied;

public class TicketsBook {
	int tickets = 25;

	public TicketsBook(int tickets) {
		super();
		this.tickets = tickets;
	}
	public TicketsBook() {
		
	}
	
	public void bookTickets(int noOfTickets,String name) {
		
		synchronized(this) {
			System.out.println("login successful");
			System.out.println("welcome to ircts");
			System.out.println("hello "+ name);
			if(tickets <noOfTickets) {
				System.out.println("No tickets available");
			}else {
				System.out.println(noOfTickets+"tickes are booked");
				tickets-=noOfTickets;
				System.out.println(tickets+"is the tickets Lefft");
			}
		}
		System.out.println("thank you!!!!!");
		
	}

}
