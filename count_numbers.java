package Variation;


public class count_numbers {
	
/*
ProblemStatement
Count numbers containing 4 
Count the numbers between 1 to N containing 4 as a digit.

 

Example 1:

Input:
N = 9
Output:
1
Explanation:
4 is the only number between 1 to 9
which contains 4 as a digit.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 48;
		myCode(n);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		int count=0;
		for(int i=0; i<=n;i++)
		{
			int j=i, last=0;
			while(j>0)
			{
				last=j%10;
				if(last==4)
				count++;
				j/=10;
			}
		}
		System.out.println("Count of numbers from 1 to  that have 4 as a a digit is "+count);
	}
}





