package com.java;

public class Constructor {
	int x;
	//parameterized constructor
	Constructor(int i)
	{
		x=i;
	}
		public static void main(String args[])
		{
			Constructor t1=new Constructor(10);
			Constructor t2=new Constructor(20);
			System.out.println(t1.x+" "+t2.x);
		}
//int x;
//Constructor ()
//{
//	x=20;
//	System.out.println("x= "+x);
//	
//}
//
//	public static void main(String[] args) {
//		Constructor c1=new Constructor();
		// TODO Auto-generated method stub
   
	}


