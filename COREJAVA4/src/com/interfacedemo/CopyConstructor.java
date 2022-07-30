package com.interfacedemo;
class Student
{
	
		
	String name="ankita";
	int age= 12;
	String course="Abc";
	//constructor
	Student(){
	System.out.println("name:"+name +", age: "+age+", course:"+course);
}
	//parameterized constructor
	Student(String n,int age,String course){
		this.name=n;
		this.age=age;
		this.course=course;
		System.out.println("name:"+name +", age: "+age+", course:"+course);
	}
	//copy constructor
	Student(Student s1){
		name=s1.name;
		age=s1.age;
		course=s1.course;
		System.out.println("name:"+name +", age: "+age+", course:"+course);
	}
		
	}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2=new Student();
		Student s3=new Student("Ankita",23,"java");
		Student s4=new Student(s2);

	}

}
