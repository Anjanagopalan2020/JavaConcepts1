package Concept2;

public class RuntimePoly2 extends RunTimePoly1{
	
	public void m1()
	{
		System.out.println("child m1");
	}
	public static void m2()
	{
		System.out.println("child m2");
	}
	

	public static void main(String[] args) {
		
		RunTimePoly1 a1=new RuntimePoly2();
		a1.m1();
		a1.m2();
		a1.m3();
	}

}
