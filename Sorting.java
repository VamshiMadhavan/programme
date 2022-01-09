

public class Sorting {

	public static void main(String[] args) {
		String s = "fdcbxnaczvf";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]>c[j])
				{
					int temp = c[i];
					c[i]=c[j];
					c[j]=(char)temp;
				}
			}
			System.out.println(c[i]);
		}
		
	}

}
