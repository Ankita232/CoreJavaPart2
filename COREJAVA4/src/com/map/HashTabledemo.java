package com.map;

import java.util.Hashtable;

public class HashTabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String>ht1=new Hashtable<>();
		Hashtable<Integer, String>ht2=new Hashtable<>();
		ht1.put(1,"Ankita");
		ht1.put(2,"Jayaram");
		ht1.put(3,"Dalvi");
		
		ht2.put(1, "Edubridge");
		ht2.put(2,"Learner");
		ht2.put(3,"portal");
		System.out.println("Mapping of ht1: "+ht1);
		System.out.println("Mapping of ht2: "+ht2);
		System.out.println("Mapping of ht1: "+ht1.remove(2));
		System.out.println("updated map ht1: "+ht1);

		


		

	}

}
