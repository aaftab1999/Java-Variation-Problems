package Variation;

public class RepresentNumber {


/*
ProblemStatement
Given a number, you have to represent this number as sum of minimum number of possible psuedobinary numbers. A number is said to be psuedobinary number if its decimal number consists of only two digits (0 and 1). Example: 11,10,101 are all psuedobinary numbers.
Examples :- 
 

Input : 44
Output : 11 11 11 11

Explanation : 44 can be represented as sum of 
minimum 4 psuedobinary numbers as 11+11+11+11  

Input : 31
Output : 11 10 10

Explanation : 31 can be represented as sum of
minimum 3 psuedobinary numbers as 11+10+10  
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 31;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int eleven=n/10;
		int rem=n%10;
		if(eleven*11<=n)
		{
			for(int i=0; i<eleven;i++)
			{
				System.out.print(11+" ");
			}
			int remain=n-eleven*11;
			for(int i=0; i<remain; i++)
			System.out.print(1+" ");
		}
		else
		{
			for(int i=0; i<rem; i++)
			{
				System.out.print(11+" ");
			}
			int remain=n-rem*11;
			for(int i=0; i<remain/10;i++)
			{
				System.out.print(10+" ");
			}
		}
		System.out.print(" ");
	}
}

/*
Input Given:
public static void main(String[] args) 
	{   

		int n = 31;
		 myCode(n);
	}

Expected Output:
11 10 10  

*/