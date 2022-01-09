package varargs;

public class VarArgsExample {
	public static int add(int...x)
	{
		int res = 0;
		for (int i = 0; i < x.length; i++) {
			res += x[i];
		}
		return res;
		
	}

	public static void main(String[] args) {
		int sum = add(1,2,43,5,6,7);
		System.out.println(sum);
		

	}

}
