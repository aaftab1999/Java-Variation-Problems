package Variation;

public class MissingNumber {
	
/*
ProblemStatement
Vaibhav likes to play with numbers and he has N numbers. One day he was placing the numbers on the playing board just to count that how many numbers he have. He was placing the numbers in increasing order i.e. from 1 to N. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. He picked up all the numbers but one number, he couldn't find. Now he have to go somewhere urgently, so he asks you to find the missing number.
NOTE: Don't use Sorting


Example 1:

Input:                                                       
N = 4                                        
A[] = {1, 4, 3}
Output:
2     
Explanation:
Vaibhav placed 4 integers but he picked
up only 3 numbers. So missing number
will be 2 as it will become 1,2,3,4.
*/ 


	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int	N = 5; 
		int	A[] = 
		{
			2, 5, 3, 1
		}
		;
		myCode(N,A);
	}
	//EndOfMainMethod
	public static void myCode(int N,int a[]) 
	{
		for(int i=0; i<N; i++)
		{
			int j=0;
			for(; j<N-1; j++)
			{
				if(a[j]==i+1)
				break;
			}
			if(j==N-1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
}
