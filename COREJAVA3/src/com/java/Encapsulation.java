package com.java;

public class Encapsulation {
public static void main(String args[]) {
	Learner l=new Learner();
	l.setRollno(1);
	l.setCity("mumbai");
	l.setName("Ankita");
	System.out.println("Learner's rollno "+l.getRollno());
	System.out.println("Learner's name "+l.getName());
	System.out.println("Learner's city "+l.getCity());
	
	
	
	
}
}
