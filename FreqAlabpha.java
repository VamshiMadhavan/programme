
public class FreqAlabpha {
	static int[] countFrequency(String s)
	{
		int count[]= new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c<'A'&&c>'Z')
			{
				count[c-65]++;
			}
			else if(c<'a'&&c>'z')
			{
				count[c-97]++;
			}
		}
		return count;
	}
	static boolean isAnagram(String s1,String s2)
	
	
	{
		int c1[]=countFrequency(s1);
		int c2[]=countFrequency(s2);
		for (int i = 0; i <26; i++) {

			if(c1[i]!=c2[i])
			{
				return false;	
			}
		}
		return true;
			
		}
		

		
	

	public static void main(String[] args) {
		String s1 = "god";
		String s2 = "dog";
		countFrequency("vmgfbCzdngxfmzdgb");
	//	boolean r=isAnagram(s1, s2);
//		if(r==true)
//			System.out.println("anagram");
//		else
//			System.out.println("not ana");
//				
		
		
	}

}
