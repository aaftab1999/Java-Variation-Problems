package Variation;

import java.util.ArrayList;

public class NumberOfDivisors {
	

/*
ProblemStatement
Number of divisors 

Given an integer N, find the number of divisors of N that are divisible by 3.
Example 1:

Input : 6
Output: 2
Explanation: 1, 2, 3, 6 are divisors 
of 6 out of which 3 and 6 are divisible 
by 3.
 */


	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 6;
		myCode(n);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 && i%3==0)
				count++;
				
		}
				System.out.println(count);
			
		
	
	}
}

