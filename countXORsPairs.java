package Variation;

public class countXORsPairs {
	
	

/*
ProblemStatement
Given an array A[] of size N. Find the number of pairs (i, j) such that
Ai XOR Aj = 0, and 1 ≤ i < j ≤ N.

Input : arr[ ] = {1, 3, 4, 1, 4}
Output : 2
Explanation:
Index( 0, 3 ) and (2 , 4 ) are only pairs 
whose xors is zero so count is 2.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[] = 
		{
			1,3,4,1,4
		}
		;
		int n = arr.length;
		myCode(arr, n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a, int n) 
	{
		// write code here
		int count=0;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if((a[i]^a[j])==0)
				count++;
			}
		}
		System.out.println(count);
	}
}

/*
Input Given:
public static void main(String[] args) 
	{
		int arr[] = {1,3,4,1,4};
		int n = arr.length;
		myCode(arr, n);
	}

Expected Output:
2

*/
