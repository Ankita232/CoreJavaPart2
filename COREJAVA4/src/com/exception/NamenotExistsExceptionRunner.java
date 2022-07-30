package com.exception;

import java.util.Scanner;

 class NamenotExistsException extends Exception {
	public NamenotExistsException(String s) {
		super(s);
	}

}
public class NamenotExistsExceptionRunner{
	public static void main(String[]args) {
		String names[]= {"Ankita","sanjana","priti","meghna","shradha"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name1=sc.nextLine();
		try {
			checkNameExists(name1,names);
		}
		catch(NamenotExistsException e)
		{ System.err.println(e.getMessage());
	}
}
	private static void checkNameExists(String name1,String[]names)throws NamenotExistsException{
		for (String str:names) {
			if (name1 == str) {
				System.out.println("name exists in string array");
				
			}
			else {
				throw new NamenotExistsException("name not exists");
			}
		}
	}
}
	
