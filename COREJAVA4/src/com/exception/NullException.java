package com.exception;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println("length of string: "+s.length());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
