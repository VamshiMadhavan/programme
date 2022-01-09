package com.technoelevte.runnbledemo;

public class Main {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		Thread thread = new Thread(myClass);
		thread.setName("chiki");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Praveen");
		System.out.println(Thread.currentThread().getName());
		thread.setName("Mahadev");
		System.out.println(thread.getName());
		thread.start();
		System.out.println("the pro is running");
		System.out.println(Thread.currentThread().getId());
		System.out.println(thread.getId());
	}

}
//sonali@testyantra.com