
package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		String name=br.readLine();
		System.out.println("name: "+name);
		System.out.println("enter your roll no.:");
		int rollno=Integer.parseInt(br.readLine());
		System.out.println("roll no:"+rollno);
		
		
				
	}

}
