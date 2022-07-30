package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		List<String>li=new ArrayList<>();
		li.add("Sayali");
		li.add(0,"Ankita"); 
		li.add("Sanjana");
		li.add(2,"priti");
		System.out.println("List of Elements: "+li);
		System.out.println("Length of list: "+li.size());
		System.out.println("get of list: "+li.get(2));
		System.out.println("Set value to list: "+li.set(3,"Anu"));
		System.out.println("List of Elements: "+li);
		System.out.println("Remove elements: "+li.remove(2));
		System.out.println("contain of elements: "+li.contains("Sanjana"));
		li.add("Sakshi");
		li.add("dev");
		System.out.println("List of Elements: "+li);
		String[]arr=li.toArray(new String[0]);
		for(String X1:arr)
		System.out.println(" "+X1);
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
				
		
	}

}
