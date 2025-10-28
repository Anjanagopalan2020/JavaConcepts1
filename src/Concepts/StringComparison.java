package Concepts;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Apple";
		String s2="Apple";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		String s11="Welcome";
		String s12=new String("Welcome");
		System.out.println(s11.equals(s12));
		System.out.println(s11==s12);
		
		
		String str1 = "Sachin";  
        String str2 = "Sachin";  
        String str3 = "Ratan";  
        System.out.println(str1.compareTo(str2));      // 0  
        System.out.println(str1.compareTo(str3));      // 1 (str1 > str3)  
        System.out.println(str3.compareTo(str1));
        
        String str = "String Compare";  
        System.out.println(str.startsWith("String")); // true  
        System.out.println(str.endsWith("Compare"));  // true  
		

	}

}

// .equals compares the values
//== compares the reference
//compareTo() compares the values lexicographycally
//startsWith & endsWith