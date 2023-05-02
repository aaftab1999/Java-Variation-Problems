package Variation;

public class SumOfAllFactorsOfANumber {


/*
ProblemStatement
WAP to find sum of all factors of a given number.
Input: Input : n = 30
Output : 72
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 15;
		myCode(n);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		int sum=0;
		int i=1;
		while(true)
		{
			if(n%i==0)
			{
				sum+=i;
			}
			if(n==i)
			break;
			i++;
		}
		System.out.println(sum);
	}
}

