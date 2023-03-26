package Variation;


public class Rotated_Array {
	
	
/*
Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

Example 1:

Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
Example 2:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 0
Explanation: The given array is not rotated

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			5, 1, 2, 3, 4
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[] a) 
	{
		//write code here
		int max=0;
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
		}
		if(index==a.length-1)
		System.out.println(0);
		else
		System.out.println(index+1);
	}
}


