import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int c = a.length;
		int t[] = new int[c];
		for (int i = 0; i < c; i++) {
			boolean r = isPrime(a[i]);
			if(r==true)
			{
				t[i]=a[i];
				c--;
			}
			System.out.print(t[i]+" ");
		}
		
		
	}

	private static boolean isPrime(int x) {
		for (int i = 2; i < x/2; i++) {
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	}
