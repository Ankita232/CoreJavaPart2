package com.java;

public class Conoverl {
int id;
String name;
int age;
Conoverl(int i,String n){
	id =i;
	name=n;
}

Conoverl(int i,int a,String n){
	id=i;
	age=a;
	name=n;
	
}
void display() {
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conoverl c=new Conoverl(112,"ankita");
		Conoverl c1=new Conoverl(102,25,"ankita");
		c.display();
		c1.display();
	}

}
