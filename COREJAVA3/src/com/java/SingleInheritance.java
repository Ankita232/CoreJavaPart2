package com.java;

class A {
	float salary=50000;
	 public String displayString() {
		return "Congradulation ";
	}
}
class B extends A{
	int bonus=20000;
	public String displayString() {
	super.displayString();
           return "Ankita";
	}
}
public class SingleInheritance{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@methodoverride
		A i=new A();
		System.out.print(i.displayString());
		B p=new B();
		System.out.println(p.displayString());
		
		System.out.println("programmer salary is "+p.salary);
		System.out.println("bonus of programmer is "+p.bonus); 
		}
	}

		
		



	


