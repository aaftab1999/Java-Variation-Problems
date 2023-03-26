package Variation;


public class NumberOfNumbers {
	
	
	
/*
ProblemStatement
Find Number of Numbers 

Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.

For Example:
Input:
A[]={11,12,13,14,15}, k=1
Output:
6
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[]= 
		{
			11,12,13,14,15
		}
		;
		int k=1;
		int	n = arr.length;
		myCode(arr,n,k);
	}
	//EndOfMainMethod
	public static void myCode(int[] arr,int n,int k) 
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			int last=0;
			while(arr[i]>0)
			{
				last=arr[i]%10;
				if(last==k)
				count++;
				arr[i]/=10;
			}
		}
		System.out.println(count);
	}
}

