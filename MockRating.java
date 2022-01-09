package com.technoelevate.springAnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MockRating {
	@Value("Below Average")
	String result;
	@Value("40")
	int theoritical;
	@Value("35")
	int practical;
	public void setResult(String result) {
		this.result = result;
	}
	public void setTheoritical(int theoritical) {
		this.theoritical = theoritical;
	}
	public void setPractical(int practical) {
		this.practical = practical;
	}
	@Override
	public String toString() {
		return "MockRating [result=" + result + ", theoritical=" + theoritical + ", practical=" + practical + "]";
	}
	
	
	
}
