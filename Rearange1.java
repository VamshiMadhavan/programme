
public class Rearange1 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int left = 0;
		int temp = 0;
		int right = a.length-1;
		for (int i = 0; i < a.length; i++) {
			while(a[left]%2==0)
			{
				left++;
			}
			while(a[right]%2==1)
			{
				right--;
			}
			System.out.println(left);
			System.out.println(right);
			System.out.println("----");
			if(left<right)
			{
				temp =a[left];
				a[left] = a[right];
				a[right] = temp;
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
