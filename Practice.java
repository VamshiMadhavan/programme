package com.technoelevate.arrlst;

import java.util.Iterator;

public class Practice {
	Object a[];
	int position;
	
	public Practice(int size) {
		a = new Object[size];	
	}
	
	void add(Object obj) {
		
		if(position>=a.length) {
			increment();
		}
		a[position]=obj;
		position++;	
	}

	 void increment() {
		Object t[] = new Object[a.length+5];
		for (int i = 0; i < a.length; i++) {
			t[i]= a[i];	
		}
		a=t;
	}
	
	Object get(int index) {
		return a[index];
	}
	
	void remove(int index) {
		for (int i = index; i < position; i++) {
			a[i]=a[i+1];
			position--;
		}
	}
	
	
	
	@Override
	public String toString() {
		String s = ","+a[0];
		for (int i = 1; i < position; i++) {
			s += ","+a[i];
		}
		s += ","+"]";
		
		return s;
	}



	class MyItr implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			return (index<position)?true:false;
		}

		@Override
		public Object next() {
			return a[index++];
		}
	}
	
	Iterator iterator() {
		return new MyItr();
		
	}
	

}
