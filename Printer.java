package com.technoelevate.sync;

public class Printer {
	int pages;

	public Printer(int papers) {
		super();
		this.pages = papers;
	}
	
	public void printIt(int pages) {
		pages = pages+1;
		
	}
	
	public void printed() {
		System.out.println(pages);
		
	}


}