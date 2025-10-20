package Concepts;

public class SuperKeyword1 extends Superkeyword {
	
	int id1=11;
	String name1="anju";


	public static void main(String[] args) {
		SuperKeyword1 sk=new SuperKeyword1();
		sk.display();
		

	}
	
	public void display1()
	{
		super.display();
		System.out.println(super.id+""+super.name);
	}
	

}

//In a Selenium framework, this is particularly useful in Page Object Model (POM) 
//designs where common functionalities (like initializing WebDriver) might be handled in a base page class, 
//and specific page classes extend this base class. The super keyword allows page objects to
//leverage inherited functionalities while also implementing their own specific behaviors.
