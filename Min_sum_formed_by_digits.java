package Variation;

import java.util.*;
public class Min_sum_formed_by_digits {
	
	
/*
ProblemStatement
Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of given array must be used to form the two numbers.

Input:
N = 6
arr[] = {6, 8, 4, 5, 2, 3}
Output:
604
Explanation:
The minimum sum is formed by numbers 
358 and 246

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			6, 8, 4, 5, 2, 3
		}
		;
		myCode(a,a.length);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		Arrays.sort(a);
		String s1="", s2="";
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0)
			s1+=a[i];
			else
			s2+=a[i];
		}
		System.out.println(s2);
		int a1=Integer.parseInt(s1);
		int a2=Integer.parseInt(s2);
		System.out.println(a1+a2);
	}
}


