package com.MenuDriven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>studentArray=new ArrayList<Student>();
		int choice,age;
		String name,city = null;
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("press 1 for add student detail");
			System.out.println("press 2 for show student detail");
			System.out.println("press 3 for search student by name");
			System.out.println("press 4 for delete user record by name");
			System.out.println("press 5 for sort user  by name");
			System.out.println("press 6 for update the age");
			System.out.println("press 7 for treeset");
			System.out.println("press 8 for quit\n\n");



			System.out.println("Make your choice");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the Student name ");
				name=sc.next();
				System.out.println("Enter student age");
				age=sc.nextInt();
				System.out.println("Enter student city");
				city=sc.next();
				Student s=new Student();
				s.setAge(age);
				s.setName(name);
				s.setCity(city);
				studentArray.add(s);
				System.out.println("Student record has been added");
				break;
			case 2:
				System.out.println("------------------------------------");
				for(int i=0;i<studentArray.size();i++)
				{
					System.out.println("Student Record: "+(i+1));
					System.out.println("Student name: "+studentArray.get(i).getName());
					System.out.println("Student age: "+studentArray.get(i).getAge());
					System.out.println("Student city: "+studentArray.get(i).getCity());

					System.out.println("------------------------------------");
				}
					break;
				
			case 3:
				System.out.println("Enter the student name for search: ");
				name=sc.next();
				int search=0;
				for(int i=0; i<studentArray.size();i++) {
					if(studentArray.get(i).getName().contains(name)){
						System.out.println("Student record: "+(++search));
						System.out.println("Student name: "+studentArray.get(i).getName());
						System.out.println("Student record: "+studentArray.get(i).getAge());
						System.out.println("Student record: "+studentArray.get(i).getCity());
                        System.out.println("-------------------------------------------");
					
				
				}
				if(search==0) {
					System.out.println("no record found for that search");						
					}
				}
				break;
				
			case 4:
				System.out.println("enter the student name for delete");
				name=sc.next();
				int search1=0;
				for(int i=0;i<studentArray.size();i++) {
					if(studentArray.get(i).getName().contains(name)) {
						System.out.println("Student record: "+(++search1));
						studentArray.remove(i);
					
					}
				}
				if(search1==0) {
					System.out.println("o record found for delete record");
				}
					else
					{
					
						System.out.println(" student record has been deleted succesfully");

					}
					break;
			case 5:
			Collections.sort(studentArray,Student.StuNameComparator);
			for(Student str:studentArray) {
				System.out.println(str.getName()+" "+str.getAge());
			}
			break;
			case 6:
				System.out.println("enter student name and city for update age in record");
				String name3=sc.next();
				int count=0;
				for(int i=0;i<)
				

					
				}
				
					
				}
			
		
	}
}

				
				
						
					

					
				
				
			
		
		

	


