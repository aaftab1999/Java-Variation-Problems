package Variation;


public class RepetitiveAdditionOfDigits {

	
/*
ProblemStatement
Repetitive Addition Of Digits 
Given a non-negative integer N, repeatedly add all its digits until the result has only one digit.

Example 1:

Input:
N = 98

Output:
8

Explanation:
Sum of digit of N = 98  is 9 + 8 = 17
Sum of digit of 17 = 1 + 7 = 8
Since 8 is the single digit number hence it is the 
required answer.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		long n =98;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(long n) 	
	{
		long sum=0;
		long last=0;
		while(n>=10)
		{
			while(n>0)
			{
				last=n%10;
				sum+=last;
				n/=10;
			}
			n=sum;
			sum=0;
		}
		System.out.println(n);
	}
}

