package Concepts;

public final class Final {
	
	final int i=10;

	public static void main(String[] args) {
		Final a=new Final();
		System.out.println(a.i);
	}
	
	public final void A1()
	{
		System.out.println("final method");
	}

}
