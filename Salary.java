package com.technoelevate.springAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Salary {
	@Autowired
	MockRating m;

	public void setM(MockRating m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Salary [m=" + m + "]";
	}
	
	

}
