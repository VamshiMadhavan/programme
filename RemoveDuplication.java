import java.util.Scanner;

public class RemoveDuplication {
	private static void removeDuplicates(int[] a) {
		int c = a.length;
		for (int i = 0; i < c; i++) {
			for (int j = i+1; j < c; j++) {
				if(a[i]==a[j])
				{
					a[i]=a[c-1];
					c--;
				}
				
			}
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		removeDuplicates(a);
	}

	

}
