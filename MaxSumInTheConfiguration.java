package Variation;


public class MaxSumInTheConfiguration {
	
	

/*
ProblemStatement
Given an array arr[] of n integers, find the maximum that maximizes the sum of the value of i*arr[i] where i varies from 0 to n-1.

Examples:  

Input: arr[] = {8, 3, 1, 2}
Output: 29
Explanation: Lets look at all the rotations,
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17

Input: arr[] = {3, 2, 1}
Output: 7
Explanation: Lets look at all the rotations,
{3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
{2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
{1, 3, 2} = 1*0 + 3*1 + 2*2 = 7

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a = 
		{
			8,3,1,2
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 	
	{
		//WriteCode Here
		int[] sum=new int[a.length];
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				sum[i]=sum[i]+a[j]*j;
			}
			int temp=a[0];
			for(int j=0;j<a.length-1; j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		int max=0;
		for(int i=0; i<a.length; i++)
		{
			if(sum[i]>max)
			max=sum[i];
		}
		System.out.println(max);
	}
}








