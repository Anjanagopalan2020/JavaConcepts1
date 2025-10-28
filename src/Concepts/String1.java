package Concepts;

public class String1 {
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Welcome");  
		String s2=s1.concat("Anjana");
		System.out.println(s2);
		
		
		String s11="abc";
		String s21="abc";
		System.out.println(s11.concat("check"));
		System.out.println(s11);
		System.out.println(s21);
		
		String s="anjana";
		
		
				
	}

}
//In Java, strings are immutable, meaning their values cannot be changed once created.
//If you try to modify a string (e.g., using concat() or
//replace()), a new string object is created instead of altering the original one.