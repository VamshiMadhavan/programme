
public class Highestdig {
	public static void main(String[] args) {
		int n = 676878454;
		int max = n%10;
		while(n!=0)
		{
			int r = n%10;
			if(r>max)
			{
				max = r;
			}
			n= n/10;
		}
		System.out.println(max);
	}

}
