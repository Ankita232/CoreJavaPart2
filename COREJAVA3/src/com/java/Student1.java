package com.java;

import java.util.Scanner;

class Student1 {
	int rollno;
	String name,city;
	 Student1(){
		rollno=1;
		name="ankita";
		city="mumbai";	
	}
	 Student1(int rollno,String name,String city){
	this.rollno=rollno;
	this.name=name;
	this.city=city;
	}
public void printDetails() {
	System.out.println("/nName,rollno,city ");
	System.out.println("name: "+name+", rollno"+rollno+", city"+city);
}
}
public class Student{
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		//Scanner sc=new Scanner(System.in);
		Student1 s=new Student1();
		s.printDetails();
		//System.out.println("Enter");
		//int rollno=sc.nextInt();
		//String name=sc.nextLine();
		//String city=sc.nextLine();
		Student1 s1=new Student1(1,"ankita","mumbai");
		s1.printDetails();

	}

}
