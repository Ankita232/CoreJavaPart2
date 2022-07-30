package com.file;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("d:\\abc.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		}
			catch(Exception e) {
				System.out.println(e);
			}
		System.out.println("\nReading of file is successful");
			
		}

	}


