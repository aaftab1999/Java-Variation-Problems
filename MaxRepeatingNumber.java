package Variation;


import java.util.TreeMap;

public class MaxRepeatingNumber {
	
/*
ProblemStatement
Maximum repeating number 
Given an array Arr of size N, the array contains numbers in range from 0 to K-1 where K is a positive integer and K <= N. Find the maximum repeating number in this array. If there are two or more maximum repeating numbers return the element having least value.

Example 1:

Input:
N = 4, K = 3
Arr[] = {2, 2, 1, 2}
Output: 2

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int k=3;
		int	arr[] = 
		{
			2, 2, 1, 2,0,0,0
		}
		;
		int n=arr.length;
		myCode(arr,n,k);
	}
	//EndOfMainMethod
	public static void myCode(int[] a, int n, int k) 
	{
		TreeMap<Integer, Integer> tm=new TreeMap<>();
		for(int i=0; i<n; i++)
		{
			if(tm.containsKey(a[i])) 
			{ 
				int value=tm.get(a[i]);
				value++;
				tm.put(a[i], value++);
				
			}
			else
				tm.put(a[i], 1);
				
		}
		
		int max=Integer.MIN_VALUE;
		int mainKey=-1;
		for (int key : tm.keySet()) {
			if (tm.get(key)>max) {
				max=tm.get(key);
				mainKey=key;
				
			}
			
		}
		System.out.println(mainKey);
	}
}

/*
Input Given:
public static void main(String[] args) {
	    int k=3;
		int	arr[] = {2, 2, 1, 0, 0, 1};
		int n=arr.length;
		myCode(arr,n,k);
	}

Expected Output:
0

YourOutPut:
2

*/

