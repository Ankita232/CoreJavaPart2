package com.exception;

public class Trywithmultiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[8]=20;
			System.out.println("My array element: "+a[2]);
			

		}
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bound");
			}
		catch(NumberFormatException e) {
			System.out.println("number format");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		finally {
			System.out.println("end...");
		}


	}

}
