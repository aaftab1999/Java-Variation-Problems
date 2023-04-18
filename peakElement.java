package Variation;

public class peakElement {

/*
ProblemStatement
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 2
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] arr= 
		{
			1,2,3
		}
		;
		int n=3;
		myCode(arr,n);
	}
	//EndOfMainMethod
	public static void myCode(int[]a,int n)
	{
		//Write code here
		if(a[0]>a[1])
		System.out.println(0);
		for(int i=1; i<n-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			System.out.println(i);
		}
		if(a[a.length-1]>a[a.length-2])
		{
			System.out.println(a.length-1);
		}
	}
}

