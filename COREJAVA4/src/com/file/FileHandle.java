package com.file;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandle {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("d:\\abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String CurrentLine=br.readLine();
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		while(CurrentLine!=null)
		{
			linecount++;
			String[]words=CurrentLine.split(" ");
			wordcount=wordcount+words.length;
			
			for(String word:words)
			{
				charcount=charcount+word.length();
			}
			CurrentLine=br.readLine();
		}
			System.out.println("the number of lines in the file..."+linecount);
			System.out.println("the number of words in the file..."+linecount);
			System.out.println("the number of characters in the file..."+linecount);
			br.close();
		

	}

}
