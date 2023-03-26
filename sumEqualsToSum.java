package Variation;


public class sumEqualsToSum {
	
/*
ProblemStatement
Given an array A of N integers. The task is to find if there are two pairs (a, b) and (c, d) such that a+b = c+d.

Input:N=7 A[] = {3, 4, 7, 1, 2, 9, 8}
 Output: 1
Explanation:(3, 7) and (9, 1) are the pairs whosesum are equal.  

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			3, 4, 7, 1, 2, 9, 8
		}
		;
		myCode(a,a.length);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				for(int k=0;k<a.length; k++)
				{
					for(int l=k+1; l<a.length; l++)
					{
						if(k!=i && k!=j && l!=i && l!=j)
						{
							if((a[i]+a[j])==(a[k]+a[l]))
							count++;
						}
					}
				}
			}
		}
		if(count>0)
		System.out.println(1);
		else
		System.out.println(0);
	}
}

