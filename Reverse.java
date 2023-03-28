package Variation;

import java.util.*;
public class Reverse {

	
/*
ProblemStatement
Given an array, reverse every sub-array formed by consecutive k elements.
Input: 
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9] 
k = 3 
Output: 
[3, 2, 1, 6, 5, 4, 9, 8, 7]
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[] = 
		{
			1, 2, 3, 4, 5, 6, 7,8
		}
		;
		int k = 3;
		int n = arr.length;
		myCode(arr,k,n);
	}
	//EndOfMainMethod
	public static void myCode(int a[], int k, int n) 
	{
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(int i=0; i<a.length; i=i+k)
		{
		
			ArrayList<Integer> al=new ArrayList<Integer>();
			for(int j=i; j<i+k && j<a.length; j++)
			{
				al.add(a[j]);
			}
		      Collections.reverse(al);
			  al2.addAll(al);
			  al.clear();
		}
		for(int i=0; i<al2.size(); i++)
		{
			System.out.print(al2.get(i)+" ");
		}
	}
}

