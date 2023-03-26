package Variation;


public class Distinct_Array_Element {
	
	
	
/*
ProblemStatement
Given a sorted array of size N. Count the number of distinct absolute values present in the array.
 
Input:
N = 6
Arr[] = {-3, -2, 0, 3, 4, 5}
Output: 5
Explanation: There are 5 distinct absolute 
values i.e. 0, 2, 3, 4 and 5.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			-3, -2, 0, 3, 4, 5
		}
		;
		int k=a.length;
		myCode(a,k);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int k) 
	{
		// write code here
		int length=0;
		for(int i=0; i<a.length; i++)
		{
			int j=0; 
			for(;j<i; j++)
			{
				if(Math.abs(a[i])==Math.abs(a[j]))
				break;
			}
			if(i==j)
			length++;
		}


		System.out.println(length);
	}
}

