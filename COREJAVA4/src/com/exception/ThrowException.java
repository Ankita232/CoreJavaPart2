package com.exception;

public class ThrowException {
	static void validate(int age) {
		if (age<18)
		{
			throw new ArithmeticException("not valid");
		}
		
		
		
		
		else {
				
				System.out.println("welcome to vote");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(20);
		System.out.println("rest of code");
		
		
		}
	}


