package com.file;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {
	public static void main(String[]args)throws Exception{
		
	
	FileOutputStream fos=new FileOutputStream("d:\\abc.txt");
	ObjectOutputStream obj=new ObjectOutputStream(fos);
//	Employee e=new Employee();
//	e.id=1;
//	e.name="abc";
//	e.city="Mumbai";
//	obj.writeObject(e)
//	System.out.println("Data is Saved");
	
	Employee e1=new Employee();
	e1.setId(101);
	e1.setName("Ankita");
	e1.setCity("Mumbai");

	Employee e2=new Employee();
	e1.setId(102);
	e1.setName("priti");
	e1.setCity("Bandra");
//	
//	Employee e3=new Employee();
//	e1.setId(103);
//	e1.setName("Sanjana");
//	e1.setCity("Pune");
//	
	obj.writeObject(e1);
//	obj.writeObject(e2);
//	obj.writeObject(e3);
	
	System.out.println("Data is saved");
	


}
					
}