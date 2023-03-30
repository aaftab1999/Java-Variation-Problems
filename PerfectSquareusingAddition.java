package Variation;

public class PerfectSquareusingAddition {
/*
	ProblemStatement
	Check perfect square using addition/subtraction
	Given a positive integer n, check if it is perfect square or not using only addition/subtraction operations and in minimum time complexity.
	We strongly recommend you to minimize your browser and try this yourself first.
	We can use the property of odd number for this purpose: 

	Addition of first n odd numbers is always perfect square 
	1 + 3 = 4,      
	1 + 3 + 5 = 9,     
	1 + 3 + 5 + 7 + 9 + 11 = 36 ...
*/
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int n = 49;
			myCode(n);
		}
		//EndOfMainMethod
		private static void myCode(int n)
		{
			int sum=0;
			for(int i=1;;i=i+2)
			{
				sum+=i;
				if(sum>=n)
				break;
			}
			if(sum==n)
			System.out.println("YES");
			else
			System.out.println("NO");
		}
	}
