package com.technoelevate.Arraylist;

public class MyarrList {
	Object[] arr;
	int position;
	public MyarrList(int size)
	{
		arr = new Object[size];
	}
	public void add(Object obj)
	{
		if(position>=arr.length)
		{
			incrementCapacity();
		}
		arr[position]=obj;
		position++;
	}
	private void incrementCapacity() {
		Object[] temp = new Object[arr.length+3];
		for (int i = 0; i < arr.length; i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
	}
	@Override
	public String toString() {
		String s ="["+arr[0];
		for (int i = 1; i < position; i++) {
			s+=","+arr[i];
		}
		s+="]";
	
		return s;
	}

}
