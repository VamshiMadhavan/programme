import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long factorial = multi(n);
		System.out.println(factorial);
	}

	 static long multi(int n) {
		if(n>1)
		return n*multi(n-1);
		else
		return 1;
	}

}
