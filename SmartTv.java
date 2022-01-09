package com.technoelevate.loosecoupexp;

public class SmartTv extends TV {

	@Override
	public void switchOn() {
		System.out.println("tv has been switched on");
	}

	@Override
	public void shiftThechannel() {
		System.out.println("channels have been shifted");
	}

	@Override
	public void switchOff() {
		System.out.println("tv has been switched off");
	}

	
	


}
