package arraypractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ArrayToCollection {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4, 5 };
		List<Integer> l = new ArrayList<>(a.length);

		for (Integer i : a) {
			l.add(Integer.valueOf(i));
		}
//		System.out.println(l);
//		
//		System.out.println("-------------------");
//		
//		Iterator<Integer> iterator = l.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//
//		
//		
//		System.out.println("------------------");

		ListIterator<Integer> listIterator = l.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		/*System.out.println("------------------");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}*/
		
		Stream<Integer> stream = l.stream();
		Spliterator<Integer> spliterator = stream.spliterator();
		
		Stream<Integer> stream2 = l.stream();
		spliterator =stream2.spliterator();
		
		Stream<Integer> stream3 = l.stream();
		 spliterator = stream3.spliterator();
		
		
		Spliterator<Integer> spliterator1 = spliterator.trySplit();
		
		spliterator.forEachRemaining((n)->System.out.println(n));
		System.out.println("----------------------------------------------");
		
		if(spliterator1!=null) {
			spliterator1.forEachRemaining((n)->System.out.println(n));
		}
		
		
		
		


	}
}
