package com.technoelevte.synchronied;

public class Ircts {

	public static void main(String[] args) {
		TicketsBook book = new TicketsBook();
		Passengers passengers1 = new Passengers(book, 5,"praveen");
		Passengers passengers2 = new Passengers(book, 3,"mahadev");
		Passengers passengers3 = new Passengers(book, 5,"yeshoda");
		passengers1.start();
		passengers2.start();
		passengers3.start();
		
	}

}
