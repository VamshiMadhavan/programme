import java.util.Scanner;

public class Sortingt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int t=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			}
		int b[] = new int[n];
		int m=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					b[m++]=a[i];
				}	
			}
			b[m++]=a[n-i];
			System.out.print(a[i]+",");
		}
		System.out.println(" ");
		
	}

}
