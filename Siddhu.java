package com.technoelevate.hasarelation;

public class Siddhu {

	public static void main(String[] args) {
		Battery bt = new Battery("hp", 30000, 5);//composition
		Processor p = new Processor("intel i11", 4, 2.4);
		HardDisk h = new HardDisk("thoshiba", 1, "SSD");
		OperatingSystem op = new OperatingSystem("Mac", "mac1.1", 10.14);
		
		LapTop l = new LapTop(799999, bt, op, h, p);
		System.out.print(l);
	}

}
