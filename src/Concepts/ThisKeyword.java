package Concepts;

public class ThisKeyword {
	
	int x;
	int y;

	public static void main(String[] args) {
		
		ThisKeyword a=new ThisKeyword(1,2);
		a.display();
		a.display1();
	}
	
	ThisKeyword()
	{
		System.out.println("abc");
	}
	ThisKeyword(int x,int y)
	{
		this();
		this.x=x;
		this.y=y;
	}
	
	
	public void display()
	{
		System.out.println(this.x+this.y);
	}
	
	public void display1()
	{
		this.display();
	}
}
