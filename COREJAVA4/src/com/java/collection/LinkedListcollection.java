package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>link=new LinkedList<>();
		link.add("ankita");
		link.add("anu");
		link.add("priti");
		System.out.println(link);
		link.addFirst("Sanjana");
		link.addLast("pallavi");
		System.out.println(link);
		System.out.println(link.peek());
		System.out.println(link);
		System.out.println(link.peekLast());
		System.out.println(link.poll());
		System.out.println("After poll"+link);
		System.out.println(link.removeFirst());
		System.out.println(link);
		Iterator x=link.descendingIterator();
		while(x.hasNext()) {
			System.out.println("value is :"+x.next());
		}
				
		

	}

}
