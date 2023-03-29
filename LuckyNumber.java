package Variation;

import java.util.ArrayList;

public class LuckyNumber {
	
	
/*
ProblemStatement
Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
Take the set of integers
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int x = 4;
		myCode(x);
	}
	//EndOfMainMethod
	public static void myCode(int x) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1; i<=x; i++)
		{
			if(i%2!=0)
			al.add(i);
		}
		int ind=al.indexOf(x)+1;
		if(al.contains(x)  && ind%3!=0)
		System.out.println(x +" is a lucky no.");
		else 
		System.out.println(x+" is not a lucky no.");
	}
}


