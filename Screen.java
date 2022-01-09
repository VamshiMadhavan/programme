package com.te.spring.autowire;

public class Screen {
	String name="amould";

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Screen [name=" + name + "]";
	}
	
}
