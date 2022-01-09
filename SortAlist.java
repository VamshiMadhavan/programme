import java.util.*;



public class SortAlist {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(40);
		l.add(30);
		l.add(80);
		l.add(70);
		l.add(20);
		l.add(80);
		l.add(90);
		l.forEach(System.out::println);
	/*	System.out.println(l);
		Collections.sort(l);
		Collections.reverse(l);*/
	}

}
