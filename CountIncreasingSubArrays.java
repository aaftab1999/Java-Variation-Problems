package Variation;

public class CountIncreasingSubArrays {
	
/*
ProblemStatement
Given an array of N integers Arr1, Arr2, ….ArrN, count number of subarrays of Arr which are strictly increasing. 
A subarray Arr[i, j] is the array where 1 <= i < j <= N is a sequence of integers of Arri, Arri+1, ….Arrj. A subarray Arr[i, j] is strictly increasing if Arri < Arri+1 < Arri+2 < ……. < Arrj.

Input: 
N = 6
Arr[] = {1, 3, 3, 2, 3, 5}
Output: 4
Explanation:
(1,3), (2, 3), (3, 5) and (2, 3, 5)
are the only increasing subarrays.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 3, 3, 2, 3, 5
		}
		;
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		System.out.println(subArray(a,n));
	}
	public static int subArray(int[] a,int n)
	{
		int count=0;
		int length=1;
		for(int j=0; j<n-1;j++)
		{
			if(a[j]<a[j+1])
			length++;
			else 
			{
				count+=(((length-1)*length)/2);
				length=1;
			}
		}
		if(length>1)
		count+=(((length-1)*length)/2);
		return count;
	}
}

