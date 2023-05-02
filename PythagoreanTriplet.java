package Variation;

import java.util.Arrays;

public class PythagoreanTriplet {
	
	
/*
ProblemStatement
Pythagorean Triplet
Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.

Example 1:

Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}
Output: Yes
Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int ar[] = 
		{
			3, 1, 4, 6, 5 
		}
		;
		int n = ar.length;
		myCode(ar,n);
	}
	//EndOfMainMethod
	public static void myCode(int []a,int n) 
	{
		Arrays.sort(a);
		boolean flag=false;
		int z=n-1;
		while(z>=2)
		{
			int x=0,y=z-1;
			while(x<y)
			{
				if((a[x]*a[x]+a[y]*a[y])==(a[z]*a[z]))
				{
					flag=true;
					break;
				}
				else if((a[x]*a[x]+a[y]*a[y])<(a[z]*a[z]))
				x++;
				else
				y--;
			}
			z--;
		}
		if(flag)
		System.out.println("Yes");
		else 
		System.out.println("No");
	}
}

/*
Input Given:
public static void main(String[] args) {
	
		int ar[] = { 3, 1, 4, 6, 5 };
		int n = ar.length;
		myCode(ar,n);
		  
	}

Expected Output:
Yes
*/