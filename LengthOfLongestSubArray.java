package Variation;


public class LengthOfLongestSubArray {
	
	
	
/*
ProblemStatement
Given an array A[] of size N, return length of the longest subarray of non- negative integers.

Note: Subarray here means a continuous part of the array.
 
Input : 
N = 9
A[] = {2, 3, 4, -1, -2, 1, 5, 6, 3}
Output : 
4
Explanation :
The subarray [ 1, 5, 6, 3] has longest length 4 and
contains no negative integers
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			2, 3, 4, -1, -2, 1, 5, 6, 3
		}
		;
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		int max=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]>=0)
			{
				int count=0;
				for(int j=i; j<a.length; j++)
				{
					if(a[j]>=0)
					count++;
					else
					break;
				}
				if(count>max)
				{
					max=count;
				}
			}
		}
		System.out.println(max);
	}
}


