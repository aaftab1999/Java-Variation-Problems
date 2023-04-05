package Variation;

public class GCDofTwoNumbers {
	
/*
ProblemStatement
GCD of two numbers formed by n repeating x and y times
Given three positive integer n, x, y. The task is to print Greatest Common Divisor of numbers formed by n repeating x times and number formed by n repeating y times. 
0 <= n, x, y <= 1000000000.
Examples : 
 

Input : n = 123, x = 2, y = 3.
Output : 123
Number formed are 123123 and 123123123.
Greatest Common Divisor of 123123 and
123123123 is 123.

Input : n = 4, x = 4, y = 6.
Output : 44

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 123, x = 5, y = 2;
		myCode(n,x,y);
	}
	//EndOfMainMethod
	private static void myCode(int n,int x,int y)
	{
		int limit=x>y?y:x;
		int repeat=1;
		int i=2;
		for(; i<=limit;i++)
		{
			if(x%i==0 && y%i==0)
			{
				repeat=i;
				break;
			}
		}
		if(i>limit)
		{
			System.out.println(n);
		}
		else
		{
			String s=Integer.toString(n);
			s=s.repeat(repeat);
			System.out.println(s);
		}
	}
}
/*
Input Given:
public static void main(String[] args) 
	{   
		 int n = 10, x = 12, y = 21;
		myCode(n,x,y);
	}

Expected Output:
101010

*/
