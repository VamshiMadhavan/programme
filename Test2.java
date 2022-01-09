package com.technoelevate.lambdaexp;

public class Test2 {

	public static void main(String[] args) {
		Test t = new Test() {
			
			@Override
			public void run() {
				System.out.println("from run");
			}
		};
	//	t.run();
		
		Test t1=()->{
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				
			}
			
		};
		t1.run();
	}

}
