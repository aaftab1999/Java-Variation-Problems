package Variation;

import java.util.Arrays;

public class RearrangeArray {
	
	/*Rearrange the array 
Given an array arr of n integers, task is to print the array in the order – smallest number, largest number, 2nd smallest number, 2nd largest number, 3rd smallest number, 3rd largest number and so on.
Example 1:
Input:
n = 9
arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}
Output:
1 9 2 8 3 7 4 6 5
Explanation:
Smallest number is 1. Largest number is 9. 
2nd smallest number is 2. Then 2nd largest
number is 8. And so on.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,4,2,5,6,7,8,9};

Arrays.sort(a);
int[] b=new int[a.length];
int i=0, j=a.length-1;
for(int k=0;k<a.length;i++,j--) 
{
	if(i<j) 
	{
		b[k++]=a[i];
		b[k++]=a[j];
		
	}
	else if(i==j)
	{
		b[k++]=a[i];
	}	
	
}
for (int j2 = 0; j2 < b.length; j2++) {
	System.out.print(b[j2]+" ");
	
}

	}

}
