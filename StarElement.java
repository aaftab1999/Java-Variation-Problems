package Variation;

public class StarElement {
	
	
/*
ProblemStatement
Given an unsorted array arr of size n. The task is to find all the star and super star elements
 in the array. Star are those elements which are strictly greater than all the elements on its 
 right side. Super star are those elements which are strictly greater than all the elements on 
 its left and right side.

Note: Assume first element (arr[0]) is greater than all the elements on its left side, And last
 element (arr[n-1]) is greater than all the elements on its right side.

Example 1:

Input:
n = 10
arr[] = {1, 6, 5, 4, 7, 8, 4, 3, 2, 1}
Output: 
8 4 3 2 1 
8
Explanation: Star elements are 8, 4, 3, 2 and 1.
Super star element is 8.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 6, 5, 4, 7, 8, 4, 3, 2, 1
		}
		;
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		int max=0,count=0;
		for(int i=0; i<n; i++)
		{
			right(a,i,n);
			if(superStar(a,i,n))
			{
				max=a[i];
			}
		}
		System.out.println();
		System.out.println(max>0?max:-1);
	}
	public static void right(int[] a, int i, int n)
	{
		int j=i+1;
		for(; j<n; j++)
		{
			if(a[i]<=a[j])
			break;
		}
		if(j==n)
		{
			System.out.print(a[i]+" " );
		}
	}
	public static boolean superStar(int[] a,int i, int n)
	{
		int j=0;
		for(; j<n; j++)
		{
			if(j!=i)
			{
				if(a[i]<=a[j])
				break;
			}
		}
		if(j==n)
		return true;
		return false;
	}
}

