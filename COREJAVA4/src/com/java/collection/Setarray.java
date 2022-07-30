package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class Setarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>s=new HashSet<>();
		s.add(2);
		s.add(3);
		System.out.println("s: "+s);
		System.out.println(s.hashCode());
				
		HashSet<String>hset=new HashSet<String>();
		hset.add("Ankita");
		hset.add("Arpita");
		hset.add("anu");
		hset.add("mrunal");
		hset.add("mrunal");
		hset.add(null);
		System.out.println("Element in hashset: "+hset);
		System.out.println();
		
		HashSet<Integer>hset1=new HashSet<>(8,(float)0.50);
		hset1.addAll(s);
		System.out.println("add all:"+hset1);
	

		
		
		

	}

}
