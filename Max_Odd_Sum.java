package Variation;



/*
ProblemStatement
Given an array of integers, check whether there is a subsequence with odd sum and if yes, then finding the maximum odd sum. If no subsequence contains odd sum, print -1.

Input:
N=4
arr[] = {4, -3, 3, -5}
Output: 7
Explanation:
The subsequence with maximum odd
sum is 4 + 3 = 7

*/
public class Max_Odd_Sum
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			4, -3, 3, -5
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		System.out.println(findMax(a));
	}
	public static int findMax(int[] a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0)
			sum+=a[i];
		}
		if(sum%2!=0)
		return sum;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		}
		if(min==Integer.MAX_VALUE)
		return -1;
		else
		sum=sum-Math.abs(min);
		return sum;
	}
}





