package com.technoelevate.mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "Aliya");
		hashMap.put(2, "Samantha");
		hashMap.put(3, "Disha");
		hashMap.put(3, "Deepika");//replaces to disha
		Set<Integer> keySet = hashMap.keySet();
		for(Object o : keySet){
			System.out.println("keys="+o+",values="+hashMap.get(o));
		}
		System.out.println("----------------------------");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();//entry set method
		for(Entry<Integer, String> s : entrySet){
			System.out.println(s);
		}
		
	}

}

