package com.file;

import java.io.File;

public class FilenotExists {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f=new File("d:\\abc.txt");
		if(f.exists()) {
			System.out.println("File Name: "+f.getName());
			System.out.println("Absolute path: "+f.getAbsolutePath());
			System.out.println("Writeable: "+f.canWrite());
			System.out.println("Readable: "+f.canRead());
			System.out.println("File size in byte: "+f.length());
		}
		else {
			System.out.println("File does not exists");
		}
		
		
		

	}

}
