package Variation;

public class kthPrimeFactor {
	
	
/*
ProblemStatement
k-th prime factor of a given number
Given two numbers n and k, print k-th prime factor among all prime factors of n. For example, if the input number is 15 and k is 2, then output should be “5”. And if the k is 3, then output should be “-1” (there are less than k prime factors). 
Examples: 
 

Input : n = 225, k = 2        
Output : 3
Prime factors are 3 3 5 5. Second
prime factor is 3.

Input : n = 81, k = 5
Output : -1
Prime factors are 3 3 3 3
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 12, k = 3;
		myCode(n,k);
	}
	//EndOfMainMethod
	private static void myCode(int n,int k)
	{
		int i=2;
		int count=0;
		while(n>1)
		{
			if(n%i==0)
			{
				count++;
				n/=i;
			}
			else
			i++;
		}
		if(k>count)
		System.out.println(-1);
		else
		System.out.println(i);
	}
}

/*
Input Given:
public static void main(String[] args) 
	{   
		  int n = 12, k = 23;
		 myCode(n,k);
	}

Expected Output:
-1
*/