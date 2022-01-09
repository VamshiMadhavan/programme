package com.technoelevate.hasarelation;

public class LapTop {
	double cost;
	Battery battery;
	OperatingSystem os;
	HardDisk hd;
	Processor processor;
	public LapTop(double cost, Battery battery, OperatingSystem os, HardDisk hd, Processor processor) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.os = os;
		this.hd = hd;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "LapTop [cost=" + cost + ", battery=" + battery + ", os=" + os + ", hd=" + hd + ", processor="
				+ processor + "]";
	}

}
