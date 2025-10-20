package Concepts;

public class StaticKeyword {
	int r,d;
	static String name="Anjana";
	StaticKeyword(int r,int d)
	{
		this.r=r;
		this.d=d;
	}
	
	public void display()
	{
		System.out.println(this.r+" "+this.d+" "+name);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
      
		StaticKeyword a=new StaticKeyword(10,20);
		a.display();
		

		
	}

}
