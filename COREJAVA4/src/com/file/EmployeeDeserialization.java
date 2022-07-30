package com.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class EmployeeDeserialization {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("d:\\abc.txt");
		ObjectInputStream obj=new ObjectInputStream(fis);
		Employee e1=(Employee)obj.readObject();
		Employee e2=(Employee)obj.readObject();
//		Employee e3=(Employee)obj.readObject();
		System.out.println("Employee details are: ");
		System.out.println("\nId: "+e1.getId()+"\nName: "+e1.getName()+"\nCity: "+e1.getCity());
		System.out.println("\nId: "+e2.getId()+"\nName: "+e2.getName()+"\nCity: "+e2.getCity());
//		System.out.println("\nId: "+e3.getId()+"\nName: "+e3.getName()+"\nCity: "+e3.getCity());
	}

}
