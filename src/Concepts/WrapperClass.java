package Concepts;

public class WrapperClass {

	public static void main(String[] args) {
		int i=10;
		Integer a=new Integer(i);//wrapping
		System.out.println(a);
		
		int j=a;
		System.out.println(j);//unwrapping

	}

}
