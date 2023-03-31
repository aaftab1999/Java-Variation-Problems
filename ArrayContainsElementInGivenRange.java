package Variation;

public class ArrayContainsElementInGivenRange {
	
	
/*
ProblemStatement
Write a program to check if array contains given range
i/p :
int[] a= {4, 5, 2, 3,3,5};
		int A=2;
		int B=5;
o/p :
true
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			4, 5, 2, 3,3,5
		}
		;
		int A=2;
		int B=5;
		myCode(a,A,B);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int A,int B)
	{
		
		 int i=0;
		for(; i<a.length; i++)
		{
			if(a[i]<A || a[i]>B)
			{
				System.out.println("false");
				break;
			}
		}
		if(i==a.length)
		System.out.println("true");
	}
}

