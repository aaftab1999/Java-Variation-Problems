package Variation;

import java.util.*;
public class SlidingWindow {

/*
ProblemStatement
Sliding Window Maximum (Maximum of all subarrays of size k)
Difficulty Level : Hard
Last Updated : 21 Feb, 2022
Given an array and an integer K, find the maximum for each and every contiguous subarray of size k.

Examples : 

Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
Output: 3 3 4 5 5 5 6
Explanation: 
Maximum of 1, 2, 3 is 3
Maximum of 2, 3, 1 is 3
Maximum of 3, 1, 4 is 4
Maximum of 1, 4, 5 is 5
Maximum of 4, 5, 2 is 5 
Maximum of 5, 2, 3 is 5
Maximum of 2, 3, 6 is 6

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[] = 
		{
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10 
		}
		;
		int k = 3;
		myCode(arr,k);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int k)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0; i<a.length-k+1; i++)
		{
			for(int j=i; j<i+k;j++)
			{
				al.add(a[j]);
			}
			System.out.print(Collections.max(al)+" ");
			al.removeAll(al);
		}
	}
}
