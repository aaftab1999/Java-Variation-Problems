package Variation;


public class PrimeFactorsOfNumber {
/*
ProblemStatement
WAP to find prime factors of a given number
Input: 15
Output: 3,5

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int number= 15;
		myCode(number);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		int div=2;
		while(n>1)
		{
			if(n%div==0)
			{
				System.out.println(div);
				n/=div;
			}
			else
			div++;
		}
	}
}

