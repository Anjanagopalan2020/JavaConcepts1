package Concepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	String testfile = null;
	public static void main(String[] args) throws IOException {
		ReadFile a=new ReadFile();
		
		// TODO Auto-generated method stub
		FileReader abc=new FileReader(("/Users/anjana.gopalant@iqvia.com/Documents/abcd.docx"));
		BufferedReader b=new BufferedReader(abc);
		while((a.testfile=b.readLine())!=null)
		{
			System.out.println(a.testfile);
		}

	}

}
