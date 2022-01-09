package com.technoelevate.customException;

public class Blocked extends RuntimeException {
	String msg;
	

	public Blocked(String msg) {
		this.msg = msg;
	}
}
