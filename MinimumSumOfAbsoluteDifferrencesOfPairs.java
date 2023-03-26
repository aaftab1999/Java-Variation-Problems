package Variation;

import java.util.*;
public class MinimumSumOfAbsoluteDifferrencesOfPairs {

	public static void main(String[] args) {
		/*Explanation 
		 * If we take the pairings as (1,2), (4,3),
		 * (7,5) and (8,6) the sum will be S=|1-2|+|4-3|+|7-5|+|8-6|=6
		 * It can be shown that this is the minimum sum we can get		 * 
		 * */
       int[] a= {4,1,8,7};
       int[] b= {2,3,6,5};
       int n=a.length;
       myCode(a,b,n);
	}

	private static void myCode(int[] a, int[] b, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		Arrays.sort(b);
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			
			sum=sum+Math.abs(a[i]-b[i]);
		}
		System.out.println(sum);
	}

}
