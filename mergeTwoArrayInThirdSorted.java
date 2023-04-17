package Variation;

import java.util.TreeSet;

public class mergeTwoArrayInThirdSorted {
	
	
/*
ProblemStatement
Write a program to merge two sorted or unsorted arrays into single sorted array without duplicates in Java
i/p :
Array A : [7, -5, 3, 8, -4, 11, -19, 21]
Array B : [6, 13, -7, 0, 11, -4, 3, -5]
o/p :
[-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21]
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a = new int[] 
		{
			7, -5, 3, 8, -4, 11, -19, 21
		}
		;
		int[] b = new int[] 
		{
			6, 13, -7, 0, 11, -4, 3, -5
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		//write code here
		TreeSet<Integer> ts=new TreeSet<>();
		for(int data:a)
		{
			ts.add(data);
		}
		for(int data:b)
		{
			ts.add(data);
		}
		System.out.println(ts);
	}
}

/*
OutPut
[-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21]
*/

