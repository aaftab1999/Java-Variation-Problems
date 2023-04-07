package Variation;
import java.util.ArrayList;
public class CountTheElements {
	

/*
ProblemStatement
Given two arrays a and b. Given q queries each having a positive integer i denoting an index of the array a. For each query, your task is to find all the elements less than or equal to qi in the array b.

Input:
N=6
a[] = {1, 2, 3, 4, 7, 9}
b[] = {0, 1, 2, 1, 1, 4} 
q[] = {5,4};
Output : 6
         6
Explanation: For 1st query, the given index is 5,
             A[5] is 9 and in B all the elements 
             are smaller than 9.
             For 2nd query, the given index is 4, 
             A[4] is 7 and in B all the elements 
             are smaller than 7.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 2, 3, 4, 7, 9
		}
		;
		int[] b= 
		{
			0, 1, 2, 1, 1, 4
		}
		;
		int[] c= 
		{
			5,4
		}
		;
		int n=a.length;
		myCode(a,b,c);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int[] b,int[] c) 
	{
		// write code here
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0; i<c.length; i++)
		{
			traverseThrough(a[c[i]],b,al);
		}
		System.out.println(al);
	}
	public static void traverseThrough(int ele,int[] b,ArrayList<Integer> al)
	{
		int count=0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i]<=ele)
			count++;
		}
		al.add(count);
	}
}

/*
Input Given:
public static void main(String[] args) 
	{
		int[] a= {1, 2, 3, 4, 7, 9};
		int[] b= {0, 1, 2, 1, 1, 4};
		int[] c= {5,4};
		int n=a.length;
		myCode(a,b,c);	
	}

Expected Output:
[6, 6]
*/

