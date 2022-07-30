package com.java;

import java.util.Scanner;

public class Student {
	int rollno=1;
	String name="Ankita";
	void display()
	{
		System.out.println("name "+name);
	
	}
	int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
		
	}
	void add1(int a,int b)
	{
		System.out.println("ADD "+(a+b));
		
	}
	String displayMsg()
	{
		System.out.println("hello");
		return "hello";
	}
	void sub(int a,int b)
	{
		System.out.println("subtraction "+(a-b));
	}
	void mul(int a,int b)
	{
		System.out.println("multiplication "+(a*b));
	}
	void div(int a,int b)
	{
		System.out.println("Division "+(a/b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		BufferedReader b1=new BufferedReader(new InputStreamReader);
		Student s=new Student();
		s.display();
		s.add(3, 7);
		s.add1(20,10);
		s.displayMsg();
		s.sub(4, 6);
		s.mul(2, 3);
		s.div(8, 2);
	}

}
