package Concepts;

public class StringBuffer1 {

	public static void main(String[] args) {
		//append method 
		StringBuffer sb=new StringBuffer("anjana");
		sb.append("gopalan");
		System.out.println(sb);
		
		
		//insert 
		StringBuffer sb1=new StringBuffer("anjana");
		sb1.insert(1,"kukku");
		System.out.println(sb1);
		
		
		//replace
		StringBuffer sb2=new StringBuffer("anjana");
		sb2.replace(1, 3, "kukku");
		System.out.println(sb2);
		
		
		StringBuffer sb3=new StringBuffer("anjana");
		sb3.delete(0, 2);
		System.out.println(sb3);}
		
		
		
}


