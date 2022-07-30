package com.java.collection;

import java.util.Collection;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector<>();
		v.add("seeta");
		v.addElement("Ankita");
		v.add("pooja");
		v.add("seeta");
		v.add("meera");
		System.out.println("vector list: "+v);
		System.out.println("vector last element is: "+v.lastElement());
		System.out.println("Display element of index position 3 vector: "+v.get(3));
		System.out.println("Set element: "+v.set(3, "meena"));
		System.out.println("vector list: "+v);
		System.out.println("capacity vector list: "+v.capacity());
		//Collections.sort(v);
		//System.out.println("sorted vector list: "+v);
		System.out.println("vector list: "+v);
		System.out.println("Indexof vector list: "+v.indexOf("seeta"));
		System.out.println("last Indexof vector list: "+v.lastIndexOf("seeta"));

		
		
		
		

	}

}
