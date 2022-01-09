
public class palin {

	public static void main(String[] args) {
		int a =100;
		int n=0,r=0,sum=0;
		for (int i = 0; i < a; i++) {
			n=i;
			while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			sum=0;
		}
	}

}
