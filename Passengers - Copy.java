package com.technoelevte.synchronied;

public class Passengers extends Thread {
	TicketsBook book;
	String name;
	int noOfTickets;
	
	
	public Passengers(TicketsBook book, int noOfTickets, String name) {
		super();
		this.book = book;
		this.noOfTickets = noOfTickets;
		this.name = name;}

	@Override
	public void run() {
		
		book.bookTickets(noOfTickets, name);
		System.out.println("-------");
		
	}

}
