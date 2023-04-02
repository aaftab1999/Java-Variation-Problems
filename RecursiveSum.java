package Variation;

public class RecursiveSum {


/*
ProblemStatement
Recursive sum of digits of a number formed by repeated appends
Given two positive number N and X. The task is to find the sum of digits of a number formed by N repeating X number of times until sum become single digit.

Examples :  

Input : N = 24, X = 3
Output : 9
Number formed after repeating 24 three time = 242424
Sum = 2 + 4 + 2 + 4 + 2 + 4
    = 18
Sum is not the single digit, so finding 
the sum of digits of 18,
1 + 8 = 9

Input : N = 4, X = 4
Output : 7
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 24, x = 3;
		myCode(n,x);
	}
	//EndOfMainMethod
	private static void myCode(int n,int x)
	{
		int sum=0;
		while(n>0)
		{
			int last=n%10;
			sum+=last;
			n/=10;
		}
		int diff=sum*x;
		if(diff>9)
		myCode(diff,1);
		else 
		System.out.println(diff);
	}
}

