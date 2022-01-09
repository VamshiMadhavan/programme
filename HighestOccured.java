import java.util.Scanner;

public class HighestOccured {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[i];
				    max = a[j];
				}
			}
			
		}
		System.out.println("max is "+max);
		//System.out.println(count);
	}

}
