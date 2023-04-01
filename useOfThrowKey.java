package Variation;

public class useOfThrowKey {
	
/*
ProblemStatement
Write a program to illustrate an example of throw keyword.
In a scenario of voting app, if  age is greater than 18,he/she is availiable for voting if not throw an Invalid AgeException.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int age =123;
		myCode(age);	
	}
	//EndOfMainMethod
	private static void myCode(int age) 
	{
		//write code here
		try
		{
			if(age<18)
			throw new InvalidAgeException("not available");
			else
				System.out.println("voting successfull");
		}
		catch(InvalidAgeException ide)
		{
			System.out.println("not eligible");
		}
		
	}
}
class InvalidAgeException extends Exception
{
	

	public InvalidAgeException(String ex)
	{
		super(ex);
	}
}

