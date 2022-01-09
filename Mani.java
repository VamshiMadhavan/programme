package com.technoelevate.customException;

public class Mani {
	public void happen() throws Blocked
	{
		System.out.println("Mani:hi kutty");
		throw new Blocked("+++++Blocked+++++ ");
		
	}
	public static void main(String[] args) {
		Mani m = new Mani();
		try {
			m.happen();
		} catch (Blocked b) {
			System.out.println(b.msg);
		}
		
	}

}
