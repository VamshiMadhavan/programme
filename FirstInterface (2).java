package com.technoelevate.interfaceambiguity;

public interface FirstInterface {
	default void m1() {
		System.out.println("from 1st");
	}

}
