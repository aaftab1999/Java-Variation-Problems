package Variation;


public class Perfect_Array {
	
	
/*
ProblemStatement
There is an array contains some non-negative integers. Check whether the array is perfect or not. An array is called perfect if it is first strictly increasing, then constant and finally strictly decreasing. Any of the three parts can be empty.


Input : Arr[] = {1, 8, 8, 8, 3, 2}
Output : Yes
Explanation:
We have an array [1, 8, 8, 8, 3, 2]. 
If we look in the range [0, 1] then 
we find that in this range the array is 
increasing, in the range [1, 3] the array 
is constant and in the range [3, 4] the 
array is decreasing.So, it satisfies the above 
condition then we return true.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 8, 8, 8, 3, 2
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		int i=1;
		while(i<n && a[i]>a[i-1])
		{
			i++;
		}
		while(i<n && a[i]==a[i-1])
		{
			i++;
		}
		while(i<n && a[i]<a[i-1])
		{
			i++;
		}
		if(i==n)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
