package Variation;

public class findIndex {
/*
ProblemStatement
Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to
write a program to find the start index( index where the element is first found from left in the array ) and 
end index( index where the element is first found from right in the array ).
if start index and end index is same then print both

Example 1: 
Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
(0 based indexing)

Example 2:
Input:
N=6
arr[] = { 6, 5, 4, 3, 1, 2 }
Key = 4
Output:  2 2 

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,5,4,6,7,5,6,7
		}
		;
		int key=5;
		myCode(a,key);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int key)
	{
		//Write code here
		int i=0, j=a.length-1;
		int first=0, last=0;
		while(i<=j)
		{
			if(a[i]==key)
			{
				first=i;
				break;
			}
			i++;
		}
		while(j>=i)
		{
			if(a[j]==key)
			{
				last=j;
				break;
			}
			j--;
		}
		System.out.println(first+""+'\n'+last);
	}
}


