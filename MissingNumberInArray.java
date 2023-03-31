package Variation;

import java.util.Arrays;

public class MissingNumberInArray {

	
/*
ProblemStatement
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			1,2,3,5
		}
		;
		int n=4;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[]a,int n)
	{
		//Write code here
		Arrays.sort(a);
		for(int i=0; i<n;i++)
		{
			if(a[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
}



