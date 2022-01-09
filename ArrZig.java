import java.util.Arrays;
import java.util.Scanner;
public class ArrZig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		zigZag(arr);
		System.out.println(Arrays.toString(arr));
		}

	 static void zigZag(int arr[]) {
		int temp = 0;
		boolean flag = true;
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i]>arr[i+1])
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
		}
			else {
				if(arr[i]<arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
	}
	if(flag == true)
		flag = false;
	else
		flag = true;
		
			
	}
		
	}

	

}
