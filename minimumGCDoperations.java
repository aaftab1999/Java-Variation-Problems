package Variation;
public class minimumGCDoperations{

/*
ProblemStatement
Minimum gcd operations to make all array elements one
Given an array A[] of size N. You can replace any number in the array with the gcd of that element with any of its adjacent elements. Find the minimum number of such operation to make the element of whole array equal to 1. If its not possible print -1.
Examples: 
 

Input : A[] = {4, 8, 9}
Output : 3
Explanation:
In the first move we choose (8, 9) 
gcd(8, 9) = 1. Now the array becomes {4, 1, 9}.
After second move, the array becomes {1, 1, 9}. 
After third move the array becomes {1, 1, 1}.

Input : A[] = { 5, 10, 2, 6 }
Output : 5
Explanation:
There is no pair with GCD equal one. We first
consider (5, 10) and replace 10 with 5. Now array
becomes { 5, 5, 2, 6 }. Now we consider pair (5, 2)
and replace 5 with 1, array becomes { 5, 1, 2, 6 }.
We have a 1, so further steps are simple.

Input : A[] = {8, 10, 12}
Output : -1
Explanation:
Its not possible to make all the element equal to 1.

Input : A[] = { 8, 10, 12, 6, 3 }
Output : 7 
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int A[] = 
		{
			2, 4, 3, 9
		}
		;
		myCode(A);
	}
	//EndOfMainMethod
	private static void myCode(int A[])
	{
		int count=0;
		for(int i=0; i<A.length; i++)
		{
			for(int j=i+1; j<A.length; j++)
			{
				if(gcd(A[i],A[j])==1)
				{
					count++;
				}
			}
		}
		if(count==0)
		System.out.println(-1);
		else
		System.out.println(A.length);
	}
	public static int gcd(int a, int b)
	{
		if(a==0)
		return b;
		return gcd(b%a,a);
	}
}

/*
Input Given:
public static void main(String[] args) 
	{   
		int A[] = {12, 45, 89, 19,12};
		myCode(A);
	}

Expected Output:
5
*/
	

