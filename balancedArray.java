package Variation;

public class balancedArray {

	/*
	 * Balanced Array 
Given an array of even size N, task is to find minimum value that can be
 added to an element so that array become balanced.
 An array is balanced if the sum of the left half of the array elements is equal to the
  sum of right half.


Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 1
Explanation: 
Sum of first 2 elements is 1 + 5  = 6, 
Sum of last 2 elements is 3 + 2  = 5,
To make the array balanced you can add 1.

	 * 
	 * 
	 * */
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] a= {1,5,3,2};
		
		
		int mid=a.length/2;
		
		int leftSum=0;
		for (int i = 0; i < mid; i++) {
			leftSum+=a[i];
		}
		int rightSum=0;
		for (int i = mid; i < a.length; i++) {
			rightSum+=a[i];
			
		}
		
		int diff=Math.abs(rightSum-leftSum);
		System.out.println(diff);
		

	}

}
