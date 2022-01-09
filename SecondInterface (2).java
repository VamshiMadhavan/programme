package com.technoelevate.interfaceambiguity;

public interface SecondInterface {
	default void m1() {
		System.out.println("from 1st");
	}

}
