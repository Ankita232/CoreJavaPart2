package com.interfacedemo;

public class StudentRecord implements CollegeData,HostelData{

	
	@Override
	public void hosteldetails() {
		// TODO Auto-generated method
		System.out.println("hostel name : SDV");
		System.out.println("hostel city name : airoli");
	
	}

	@Override
	public void studentrecord() {
		// TODO Auto-generated method stub
		System.out.println("student name : ankita");
		System.out.println("student roll no. : 12");
		
	}

	@Override
	public void collegedetails() {
		// TODO Auto-generated method stub
		System.out.println("college name : SDV");
		System.out.println("collge city name : navi mumbai");
		
	}

	@Override
	public void studentdata() {
		// TODO Auto-generated method stub
		System.out.println("student degree : BE");
		System.out.println("student id  : 1");
		
	}
	public static void main(String[]args) {
		StudentRecord s=new StudentRecord();
		s.hosteldetails();
		s.studentrecord();
		s.collegedetails();
		s.studentdata();
		
	}
}
