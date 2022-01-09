package com.technoelevate.list;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Praven");
		list.add("Mhadev");
		list.add("shidhu");
		list.add(null);
		Iterator itr = list.iterator();
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(itr.next());
			
		}
		//while (itr.hasNext()) {
		//System.out.println(itr.next());}}

}}
