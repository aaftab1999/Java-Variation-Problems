package Variation;

import java.util.*;
public class BinarySearch {

/*
ProblemStatement
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.
Example 1:
Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[] = 
		{
			10,20,30,40,50
		}
		;  
		int key = 20; 
		myCode(key,arr);
	}
	//EndOfMainMethod
	public static void myCode(int key,int arr[]) 
	{
		int index=Arrays.binarySearch(arr,key);
		if(index>0)
		System.out.println(index);
		else
		System.out.println(-1);
	}
}

