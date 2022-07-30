package com.java;

 class Minfunction {
public static int minFunction(int n1,int n2)
{
	int min=0;
	if(n1>n2)
	{
		min=n2;
	}else {
		min=n1;
	}
	return min;
}
public static double minFunction(double n3,double n4)
{
	double min=0.0;
	if(n3>n4)
	{
		min=n4;
	}else {
		min=n3;
	}
	return min;
}
public class MinValue1{
	public static void main(String[] args) {
		int n1=14,n2=20;
		double n3=20.5,n4=10.5;
		int result1=Minfunction.minFunction(n1,n2);
		double result2=Minfunction.minFunction(n3, n4);
		System.out.println("Min of intergers: "+result1);
		System.out.println("Min of double: "+result2);
		
	
}
	
		// TODO Auto-generated method stub
     
	}

}
