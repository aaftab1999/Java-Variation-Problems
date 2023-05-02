package Variation;

public class ReversibleNumber {
	
/*
ProblemStatement
Reversible numbers
A number is said to be a reversible if sum of the number and its reverse had only odd digits. The problem is to find out if a number is reversible or not. 

Examples: 

Input: 36 
Output: Reversible number
as 36 + 63 = 99 has only odd digits.

Input: 409 
Output: Reversible number
as 409 + 904 = 1313 has only odd digits.

Input: 35 
Output: Not Reversible number
as 35 + 53 = 88 has only odd digits
*/


	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 36;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int reverse=reverse(n);
		int sum=n+reverse;
		if(checkOdd(sum))
		System.out.println("Reversible Number");
		else
		System.out.println("Non-Reversible Number");
	}
	public static boolean checkOdd(int sum)
	{
		while(sum>0)
		{
			int last=sum%10;
			if(last%2==0)
			return false;
			sum/=10;
		}
		return true;
	}
	public static int reverse(int n)
	{
		int store=0;
		while(n>0)
		{
			int last=n%10;
			store=store*10+last;
			n/=10;
		}
		return store;
	}
}

/*
Input Given:
public static void main(String[] args) 
	{   
		  int n = 15;
		myCode(n);
	}

Expected Output:
Non-Reversible Number
*/