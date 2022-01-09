import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year:");
		int y= sc.nextInt();
		System.out.println("enter month:");
		int m = sc.nextInt();
		if((y%400==0) || (y%4==0)  && (y%100!=0) )//2004 feb 28
		{
			System.out.println("leap year");
		}
		
		else
			System.out.println("not leap year");
		if(y <1)
		{
			System.out.println("invalid");
		}
		
		switch (m)
		{
		case 1 :
			System.out.println("31 days");
			break;
		case 2 :
			System.out.println("28/29 days");
			break;
		case 3 :
			System.out.println("31 days");
			break;
		case 4 :
			System.out.println("30 days");
			break;
		case 5 :
			System.out.println("31 days");
			break;
		case 6 :
			System.out.println("30 days");
			break;
		case 7 :
			System.out.println("31 days");
			break;
		case 8 :
			System.out.println("31 days");
			break;
		case 9 :
			System.out.println("30 days");
			break;
		case 10 :
			System.out.println("31 days");
			break;
		case 11 :
			System.out.println("30 days");
			break;
		case 12 :
			System.out.println("31 days");
			break;
		default:
			System.out.println("invalid");
		}
		
		
	

	}
	


}
