package Variation;

import java.util.Arrays;

public class SumOfPairClosestToX {

/*
	ProblemStatement
	Given a sorted array arr[] of size N and a number X, find a pair in array whose sum is closest to X.

	Input:
	N = 6, X = 54
	arr[] = {10, 22, 28, 29, 30, 40}
	Output: 22 30
	Explanation: As 22 + 30 = 52 is closest to 54.
*/
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= 
			{
				10, 22, 28, 29, 30, 40
			}
			;
			int x=54;
			int n=a.length;
			myCode(a,n,x);	
		}
		//EndOfMainMethod
		public static void myCode(int[] a,int n,int x) 
		{
			// write code here
			int min=Integer.MAX_VALUE;
			int[] result=new int[2];
			for(int i=0; i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					int sum=0;
					if(j!=i)
					{
						sum=a[i]+a[j];
						int diff=sum-x;
						if(Math.abs(diff)<min)
						{
							min=Math.abs(diff);
							result[0]=a[i];
							result[1]=a[j];
						}
					}
				}
			}
			System.out.println(Arrays.toString(result));
		}
	}

