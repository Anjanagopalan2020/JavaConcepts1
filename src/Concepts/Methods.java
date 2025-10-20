package Concepts;

public class Methods {

	public static void main(String[] args) {
		Methods a=new Methods();
		AccessModifier a1=new AccessModifier();
		
		a.methodA();
		a.methodB();
		methodC();
	}
	
	public void methodA()
	{
		System.out.println("this is methodA");
	}
	
	public void methodB()
	{
		methodA();
		System.out.println("this is methodB");
		methodC();
	}
	
	public static  void methodC()
	{
		System.out.println("this is methodC");
	}

}



//static/non static method can access non static method simply call the method
//main method need to create a object to access static methods
//package is group of related classes

