package Variation;

public class SylvestersNumber {
	

/*
ProblemStatement
Sylvester’s sequence
In number system, Sylvester’s sequence is an integer sequence in which each member of the sequence is the product of the previous members, plus one. Given a positive integer N. The task is to print the first N member of the sequence. 
Since numbers can be very big, use %10^9 + 7.
Examples: 
 

Input : N = 6
Output : 2 3 7 43 1807 3263443

Input : N = 2
Output : 2 3
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 6;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		long a=1, b=2;
		for(int i=0; i<n;i++)
		{
			System.out.print(b+" ");
			b=b*a;
			a=b;
			b=b+1;
		}
	}
}


/*
Input Given:
public static void main(String[] args) 
	{   
		int n = 6;
		myCode(n);
	}

Expected Output:
2 3 7 43 1807 3263443 
*/