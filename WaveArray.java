package Variation;

public class WaveArray {
	
/*
ProblemStatement
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
Example 2:

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] arr= 
		{
			1,2,3,4,5
		}
		;
		int n=5;
		myCode(arr,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n)
	{
		int limit=n%2==0?n:n-1;
		//Write code here
		
		for(int i=0; i< limit;i=i+2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			System.out.println(a[i]+""+'\n'+a[i+1]);
		}
		if(a.length%2!=0)
		System.out.println(a[a.length-1]);
	}
}

