package com.technoelevate.exception;
public class MultipleCatchBlock {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		try {
			int z = a/b;
			int arr[] = new int[z];
			arr[5]=40;
			System.out.println(arr[5]);
			System.out.println(z);
		} 
//		catch (ArithmeticException ae)
//		{
//			System.out.println("infinite");
//		}
//		catch (ArrayIndexOutOfBoundsException aib)
//		{
//			System.out.println("size of array is smaller");
//		}
//		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e ) {
//		if(e instanceof ArithmeticException)
//			{
//				System.out.println("infinite");
//			}
//			if(e instanceof ArrayIndexOutOfBoundsException)
//			{
//				System.out.println("size of array is smaller");
//			}
//		}
		catch (RuntimeException e) {
			//RuntimeException e = new ArithmeticException();//upcasting
			RuntimeException e1 = new ArrayIndexOutOfBoundsException();//upcasting
			System.out.println("exception occured");
		}
		/*catch (Exception e) {
			//Exception e = new RuntimeException();upcasting
			System.out.println("exception occured");
		}*/
//		catch (ArrayIndexOutOfBoundsException ae) {
//			System.out.println("ArrayIndexOutOfBoundsException");
//		}
		
	}

}
