package Variation;

public class FindANumberX {
	
/*
ProblemStatement
Find a number x such that sum of x and its digits is equal to given n.
Given a positive number n. We need to find a number x such that sum of digits of x to itself is equal to n. 
If no such x is possible print -1.
Examples: 
 

Input : n = 21
Output : x = 15
Explanation : x + its digit sum = 15 + 1 + 5 = 21 

Input : n = 5
Output : -1

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 43;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		for(int i=1; i<n;i++)
		{
			int temp=i;
			int sum=i;
			while(temp>0)
			{
				int last=temp%10;
				sum+=last;
				temp/=10;
			}
			if(sum==n)
			{
				System.out.println("x = "+i);
				break;
			}
		}
	}
}

