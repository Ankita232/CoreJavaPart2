package com.java;

abstract class MyClass {
	abstract void calculate(double x);
}
class Square extends MyClass
{
	void calculate(double x)
	{
		System.out.println("Square= "+(x*x));
	}
class Sqaureroot extends MyClass{
	void calculate(double x) {
		System.out.println("Sqaurerrot= "+Math.sqrt(x));
	}
}

public class Abstractdemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Square s1=new Square();
    s1.calculate(4);
	Sqaureroot s2=new Sqaureroot();
	
	s2.calculate(4);
	MyClass reference;
	reference=s1;
	s1.calculate(4);
	reference=s2;
	s2.calculate(4);
	

	}

}
}
