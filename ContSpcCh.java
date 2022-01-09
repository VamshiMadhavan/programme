
public class ContSpcCh {

	public static void main(String[] args) {
		String s = "ab&#cd@$_";
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c>'A'&&c<'Z'||c>'a'&&c<'z'||c>'0'&&c<'9')		
					count++;
		}
		System.out.println(s.length()+" "+count);
		
		
	}

}
