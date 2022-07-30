package com.java;

public class InheritanceEmployee1 {
	float salary=50000;
	void display() {
		System.out.println("Congradulation");
	}
}
class Programmer1 extends InheritanceEmployee1 {
	int bonus=20000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer1 p=new Programmer1();
		System.out.println(p.display());
		System.out.println("programmer salary is "+p.salary);
		System.out.println("bonus of programmer is "+p.bonus);

	

	}

}
