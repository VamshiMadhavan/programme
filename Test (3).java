package com.technoelevate.lambdaexp;

public interface Test {
	
   void run();
   
   default void run1() {
	   System.out.println("run1");
	   
   }

}
