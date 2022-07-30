package com.java;

public class Moverloading {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
		double add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moverloading m1=new Moverloading();
		m1.sum(20,10);
		m1.sum(10, 10,10);
		m1.add(10f, 10f);
		m1.add(2, 2);
	}

}
