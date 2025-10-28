package Concepts;

public class ExceptionHandling {
	public static void main(String args[])  
	  {   
	
	try
	{
		int[] a=new int [3];
		 a[5]=10;
	}
	
	finally {    
	    System.out.println("Finally block is always executed");    
	    
	    }      
	    System.out.println("rest of the code...");      
}
}
