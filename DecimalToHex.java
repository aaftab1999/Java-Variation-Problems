package Variation;

public class DecimalToHex {

/*
ProblemStatement
Java Program Convert Decimal To Hexadecimal
Input:int num =987;
output:Hexadecimal number is : 
3DB

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int num =987;
		myCode(num);
	}
	//EndOfMainMethod
	private static void myCode(int num)
	{
		String s=Integer.toString(num,16);
		s=s.toUpperCase();
		System.out.println("Hexadecimal number is : "+'\n'+s);
	}
}

/*
Input Given:
public static void main(String[] args) 
	{
		int num =987;
		   myCode(num);
	}

Expected Output:
Hexadecimal number is : 
3DB

*/