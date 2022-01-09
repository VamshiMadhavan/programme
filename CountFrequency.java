
public class CountFrequency {

	public static void main(String[] args) {
		String s = "wewdcffdswzccsdvfdv";
		s = s.toLowerCase();
		int f[] = new int[s.length()];
		char c[]= s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			f[i]=1;
			
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j])
				{
					f[i]++;
					
					
					c[j]='0';
				}
				
			}
		}
		for (int i = 0; i < f.length; i++) {
			if(c[i]!=' ' && c[i] != '0')
				System.out.println(c[i]+"-"+f[i]);
		}
			
				
}}

	
