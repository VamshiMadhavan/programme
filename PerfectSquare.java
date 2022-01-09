
public class PerfectSquare {

	public static void main(String[] args) {
		int a[] = {49,36,24,56};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			for (int j = 1;j <=9; j++) {
				if(j*j==n)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
