package Concepts;

import java.util.Arrays;

public class StringConcatination {

	public static void main(String[] args) {
		
		String s1="Anajna" + "Gopalan";
		System.out.println(s1);
		
		
		
		String s11="Anajna" ;
		s11=s11.concat("gopalan");
		System.out.println(s11);
		
		
		 StringBuffer a=new StringBuffer("anjana");
		 a.append("gopalan");
		 a.append("vandana");
		
		 System.out.println(a);
		 
		 String a1="kukku";
		String b1=String.join(" ",a1, "test");
		System.out.println(b1);
		
		String str="Testing";
				System.out.println(str.substring(1, 2));
				
				String text= new String("Hello, My name is Sachin");  
		        /* Splits the sentence by the delimeter passed as an argument */  
		        String[] sentences = text.split(",");  
		        System.out.println(Arrays.toString(sentences));  
		        
		        int a3=10;    
		        String s=String.valueOf(a3);    
		        System.out.println(s+10);  
		        
		        String s0=new String("Sachin");   
		        String s3 = s1.concat("GFG");
		        String s2=s3.intern();  
		        
		        System.out.println(s3==s2);
		       
		           
		

	}

}
