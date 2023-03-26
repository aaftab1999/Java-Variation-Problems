package Variation;


public class ElementBeforeWhichNoElementIsBigger {

	

/*
ProblemStatement
You are given an array A of size N. The task is to find count of elements before which all the elements are smaller. First element is always counted as there is no other element before it.

Input : 
arr[] =  {10, 40, 23, 35, 50, 7}
Output : 
3
Explanation :
The elements are 10, 40 and 50.
No of elements is 3
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			10, 40, 23, 35, 50, 7
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		int count=0;
		for(int i=n-1; i>=0; i--)
		{
			int j=0;
			for(; j<i; j++)
			{
				if(a[i]<a[j])
				break;
			}
			if(j==i)
			count++;
		}
		System.out.println(count);
	}
}
