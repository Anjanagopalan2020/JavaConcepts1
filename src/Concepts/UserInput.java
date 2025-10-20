package Concepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)throws IOException  {
		System.out.println("Enter input");
		Scanner abc=new Scanner(System.in);
		String abc1=abc.next();
		//abc.close();
		System.out.println(abc1);
	
	
	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in)); 
    
    System.out.print("Input your site name :");
     ;
    // To read da int mySite;
	
		 String mySite = myReader.readLine();
		 int test=Integer.parseInt(mySite);
	
    // To print the my site name 
    System.out.println("Site name is : "+ test);   

}
}
