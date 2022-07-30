package com.file;

import java.io.FileReader;

public class Reader {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("d:\\abc.txt");
				int i;
			while((i=fr.read())!=-1)
				System.out.print((char)i);
			fr.close();

	}

}
