package Concepts;

public class AccessModifier {

	public static void main(String[] args) {
		AccessModifier a=new AccessModifier();
		a.A();
		a.B();
		a.C();
		a.D();
		System.out.println(a.name);
		System.out.println(a.i);
		System.out.println(a.c);
		System.out.println(a.b);
		
	}
	public String name="anjana";
	private int i=10;
	protected char c='A';
	int b=10;
	
	public void A()
	{
		System.out.println("public method");
	}
	private void B()
	{
		System.out.println("private method");
	}
	 void C()
	{
		System.out.println("default method");
	}
	 protected void D()
		{
			System.out.println("protected method");
		}
	

}
