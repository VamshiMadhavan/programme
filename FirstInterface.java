package com.technoelevate.interface1;

public interface FirstInterface {
	void method(); //bydefault public and abstract
	int i =10;//bydefault public and static final
	default void hi()
	{
		System.out.println("default method1 from Firstinterface");
	}
	static void method2()
	{
		System.out.println("static method2");
	}

}
