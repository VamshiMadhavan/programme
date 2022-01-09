import java.util.Scanner;

public class Looping {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n=sc.nextInt();
//	int ln=sc.nextInt();
//	while(n!=100)
//	{
//		System.out.println(n+1);
//		n++;
//	}
	for (int i = 0; i <=n; i++) {
		System.out.println(i++);
	}
}
}
