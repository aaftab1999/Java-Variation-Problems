package Variation;

public class ClosestNumber {
	
	
/*
ProblemStatement
Closest Number 

Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

 

Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int N = 13 , M = 4;
		myCode(N, M);
		myCode1(N,M);
	}
	//EndOfMainMethod
	public static void myCode(int N, int M)
	{
		for(int i=N-1; ; i--)
		{
			if(i%M==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
	
//more sensible logic
	public static void myCode1(int N, int M)
	{
		int prev=N;
		int next=N;
		while(true)
		{
			if(--prev%M==0)
			{
				System.out.println(prev);
				break;
			}
			else if(++next%M==0)
			{
				System.out.println(next);
				break;
			}
		}
	}
}



/*
Input Given:
public static void main(String[] args) {
	
		int N = -15 , M = 6;
		myCode(N, M);
	}

Expected Output:
-18

*/
