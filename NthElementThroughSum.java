package Variation;
import java.util.*;
public class NthElementThroughSum {

/*
ProblemStatement
Given two sorted arrays A and B of length L1 and L2, we can get a set of sums(add one element from the first and one from second). Find the Nth element in the set considered in sorted order.
Note: Set of sums should have unique elements.

Input: L1 = 2, L2 = 2
A = {1, 2}
B = {3, 4}
N = 3
Output: 6
Explaination: The set of sums are in 
the order 4, 5, 6.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2
		}
		;
		int[] b=
		{
			3,4
		}
		;
		int L1=2;
		int L2=2;
		int N=3;
		int n=a.length;
		myCode(a,b,L1,L2,N);
	}
	//EndOfMainMethod
	public static void myCode(int[] a, int[] b, int l1, int l2, int n) 
	{
		// write code here
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0; i<l1; i++)
		{
			int sum=a[i];
			for(int j=0; j<l2; j++)
			{
				sum+=b[j];
				ts.add(sum);
				sum=a[i];
			}
		}
		int i=1;
		for(int data:ts)
		{
			if(i==n)
			System.out.println(data);
			i++;
		}
	}
}



