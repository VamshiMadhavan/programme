
public class ConstructorChaininig {
	int a,b;
	ConstructorChaininig(int a)
	{
		this.a = a;
	}
	ConstructorChaininig(int a, int b)
	{
		this(a);
		this.b = b;
	}

	public static void main(String[] args) {
		ConstructorChaininig cc1 = new ConstructorChaininig(1);
		ConstructorChaininig cc2 = new ConstructorChaininig(9,7);
		System.out.println(cc1.a);
		System.out.println(cc2.a);
	}

}
