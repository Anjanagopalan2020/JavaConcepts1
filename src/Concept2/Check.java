package Concept2;

public class Check {
	
	public static void invalidage(int age) throws InvalidAgeException   {
		if (age<18)
		{
			throw new InvalidAgeException("Age must be 18 or above.");
		}
		System.out.println("\"Valid age: " + age);
	}

	public static void main(String[] args) {
		try
		{
			invalidage(12);
		}
		catch(InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
		}
			
		

	}

}
