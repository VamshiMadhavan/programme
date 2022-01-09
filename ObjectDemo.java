package com.technoelevate.object;

import java.util.Objects;

public class ObjectDemo {
	int id;

	public ObjectDemo(int id) {
		super();
		this.id = id;
	}
	
//	@Override
//	public String toString() {
//		return "ObjectDemo [id=" + id + "]";
//	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public void finalize()
	{
		System.out.println("garbage collectod");
	}
	

	public static void main(String[] args) {
		ObjectDemo o = new ObjectDemo(2);
		ObjectDemo d = new ObjectDemo(3);
//		System.out.println(o);
//		System.out.println("-------------------------");
//		System.out.println(o.getClass());//gives fully qualified class name
//		System.out.println("-------------------------");
//		System.out.println(o.hashCode());
//		System.out.println("-------------------------");
//		System.out.println(d.hashCode());
//		System.out.println("-------------------------");
//		ObjectDemo d1 = o;//assigning o to d1
//		System.out.println(d1.hashCode());
//		System.out.println("-------------------------");
		o = null;
		System.gc();
	}

	

	

}
