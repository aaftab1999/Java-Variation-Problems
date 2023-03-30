package Variation;

public class NthFibonacci {
	
/*
	ProblemStatement
	Nth Even Fibonacci Number 
	Given a positive integer N, find the Nth Even Fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

	Example 1:

	Input: n = 1
	Output: 2 
	Explanation: 2 is the first even
	number in the fibonacci series.

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
			long a=1,b=1,count=0;
			while(true)
			{
				long sum=a+b;
				if(sum%2==0)
				{
					count++;
					if(count==n)
					{
						System.out.println(sum);
						break;
					}
				}
				a=b;b=sum;
			}
		}
	}

