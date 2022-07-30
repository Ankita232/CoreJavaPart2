package com.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			
		
		int a=5;
		int b=0;
		int c=a/b;
		}
		catch(ArithmeticException e) {
			
		
		System.out.println(e);	}
		finally {
        System.out.println("Arithmetic exception");
	}
	}
        
}
