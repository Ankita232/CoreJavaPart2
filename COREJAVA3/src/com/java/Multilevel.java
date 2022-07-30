package com.java;

 class Data{
	int a,b;
	void getdata()
	{
		a=10;
		b=20;
		
	}
}
class Sum extends Data{
	int sum;
	void sum1() {
		sum=a+b;
		System.out.println("sum: "+sum);
	}
}
class Sub extends Sum{
	int sub;
	public void subt() {
	
	sub=a-b;
	System.out.println("subtraction: "+sub);
	}
}
public class Multilevel
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1=new Sub();
		s1.getdata();
		s1.sum1();
		s1.subt();

	}

}
