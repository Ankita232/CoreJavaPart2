package com.map;

import java.util.HashMap;

public class HashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>numbers=new HashMap<>();
		numbers.put("ankita", 1);
		numbers.put("Sanjna", 3);
		numbers.putIfAbsent("Pranita", 2);
		numbers.containsKey(1);
		numbers.replace("Priti", 3,1);
		System.out.println(""+numbers);
		

	}

}
