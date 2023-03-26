package Variation;

import java.util.*;
public class move_0s_to_last {
	
	
/*
ProblemStatement
Given an array of n numbers. The problem is to move all the 0’s to the end of the array while maintaining the order of the other elements. Only single traversal of the array is required.
Examples: 
 

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6}
Output : 1 2 3 6 0 0 0

*/



	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[] = 
		{
			0, 0, 9, 8, 4, 0, 0, 2,
			7, 0, 6, 0, 9
		}
		;
		myCode(arr);
	}
	//EndOfMainMethod
	private static void myCode(int[] arr) 	
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				
			
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[j]!=0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			}
			
		}
		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]!=0)
//			al.add(arr[i]);
//		}
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]==0)
//			al.add(arr[i]);
//		}
//		System.out.print("Original array: ");
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		System.out.print("Modified array: ");
		for(int i=0; i<arr.length; i++)
		{
			//arr[i]=al.get(i);
			System.out.print(arr[i]+" ");
		}
	}
}

