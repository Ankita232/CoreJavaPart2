package com.exception;

public class numberformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String s="Ankita";
			
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
