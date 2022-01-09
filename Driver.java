package com.technoelevate.loosecoupling;

public class Driver {
	public void drive(Car c)
	{
		c.start();
		c.accelarate();
		c.brake();
	}

}
