package Variation;
import java.util.*;
public class FindNthMaxNumber {


/*
ProblemStatement
write a program to find nth max element in array
i/p : 
int[] a= {7, 10, 4, 3, 20, 15};
		int n=4;
o/p : 
10

NOte: 1st step: find unique elements in array
      2nd step: copy unique elements in new array
      3rd step: sort array
      4th step: print nth element
example: in above array after sort
     3,4,7,10,15,20
so n = 3
output: 7

if n = 4
output: 10
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,4,23,4,3,2,4,33,55,77,11,22,44,99
		}
		;
		int numOfMax=5;
		myCode(a,numOfMax);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		//write code here or  logic
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int data:a)
		{
			ts.add(data);
		}
		System.out.println(ts);
		int i=0;
		for(int data:ts)
		{
			i++;
			if(i==n)
			{
				System.out.println(data);
				break;
			}
		}
	}
}
/*
Input Given:
public static void main(String[] args) 
	{	
		int[] a= {1,4,5,2,9,6,4,7,5,8,3,4,2,3,1,8,8,8,9,9,9};
		int numOfMax=6;
		myCode(a,numOfMax);
	}

Expected Output:
[1, 2, 3, 4, 5, 6, 7, 8, 9]
6

*/