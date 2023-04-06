package Variation;

public class CountingElementsInTwoArrays {

	
/*
ProblemStatement
\Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:

Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6
Example 2:

Input:
m = 5, n = 7
arr1[] = {4 8 7 5 1}
arr2[] = {4,48,3,0,1,1,5}
Output: 5 6 6 6 3
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,7,9,2
		}
		;
		int[] b= 
		{
			0,1,2,1,1,4
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		//write code here
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<b.length; j++)
			{
				if(a[i]>=a[j])
				count++;
			}
			System.out.print(count+" ");
		}
	}
}

/*
Input Given:
public static void main(String[] args) 
	{
		int[] a= {4098 ,7968, 4523 ,277 ,6956 ,4560 ,2062 ,5705 ,5743 ,879 ,5626 ,
				9961 ,491 ,2995 ,741 ,4827 ,5436};
		int[] b= {9989 ,3403 ,3902 ,153 ,292, 1181,6220, 7515 ,8517 ,8694, 5447 ,
				10525 ,3570,337 ,1869 ,8711 ,3265 ,3897 ,5834 ,9894 ,6301 ,1409 ,8920 ,
				7931,6472 ,4664 ,3940 ,7711 ,5851 ,6868 ,3145 ,5242 ,10260 ,10355};
		
		myCode(a,b);
	}

Expected Output:
[13, 25, 13, 1, 22, 13, 6, 16, 16, 3, 16, 30, 3, 6, 3, 14, 15]

*/