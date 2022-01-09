import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int c[] = new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			i++;
		}
		while(i<a.length)
		{
			c[j]=a[i];
			j++;
			i++;
		}
		while(i<b.length)
		{
			c[j]=b[i];
			
			i++;
			j--;
		}
		for (int m = 0; m < c.length; m++) {
			System.out.println(c[m]+" ");
		}

	}

}
