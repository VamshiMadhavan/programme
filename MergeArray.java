import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of arr1 ");
		int m = sc.nextInt();
		System.out.println("enter the length of arr2 ");
		int n = sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		 int sum[] = new int[arr1.length+arr2.length];
		 for (int i = 0; i < arr1.length; i++) {
			sum[i] = arr1[i];
		}
		 for (int i = 0; i < arr2.length; i++) {
			sum[arr1.length+i]=arr2[i];
		}
		 for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i]+" ");
		}
		 System.out.println("---------------------------");
		for (int i = 0; i < sum.length; i++) {
			int temp = 0;
			for (int j = i+1; j < sum.length; j++) {
				if(sum[i]>sum[j])
				{
					temp = sum[i];
					sum[i]=sum[j];
					sum[j]=temp;
				}
			
			}
			System.out.print(sum[i]+" ");
		}
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]%2==0)
			{
				System.out.println(sum[i]+"is even numbers");
			}
			else
				System.out.println(sum[i]+"is odd number");
		}
		for (int i = 0; i < sum.length; i++) {
			int max = sum[0];
			for (int j = 0; j < sum.length; j++) {
				if(sum[i]>max)
				{
					max = sum[i];
				}
			}
			System.out.println(max);
		}
		int addarr =0;
		for (int i = 0; i < sum.length; i++) {
			
			addarr = addarr + sum[i];	
		}
		System.out.println(addarr +"is the sum");
		
		
		
	}

	 
	

}
