package Variation;

import java.util.Arrays;

public class ReorganizeArrray {
	
/*
ProblemStatement
Given an array of elements of length N, ranging from 0 to N-1, your task is to write a program that rearranges the elements of the array. All elements may not be present in the array, if the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

Input : A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : -1 1 2 3 4 -1 6 -1 -1 9
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			-1, -1, 6, 1, 9, 3, 2, -1, 4, -1
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		for(int i=0; i<n; i++)
		{
			int j=0;
			for(; j<n; j++)
			{
				if(a[j]==i)
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

