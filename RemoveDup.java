import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int c = a.length;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if(a[i]==a[j])
				{
					a[i]=a[c-1];
					c--;
					
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
