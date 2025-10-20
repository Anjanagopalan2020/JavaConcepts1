package Concepts;

public class Superkeyword {
	
	static int id=10;
	String name="anjana";
	
	Superkeyword()
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		
		Superkeyword sk=new Superkeyword();
		sk.display();
	}
	
	public void display()
	{
		System.out.println(id+""+name);
	}

}
