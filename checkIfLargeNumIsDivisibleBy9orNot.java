package Variation;

public class checkIfLargeNumIsDivisibleBy9orNot {
	
	
/*
ProblemStatement
Check if a large number is divisible by 9 or not
Given a number, the task is to find if the number is divisible by 9 or not. The input number may be large and it may not be possible to store even if we use long long int.

Hint: number is divisible by 9 of the sum of digits of a number is divisible by 9

Examples: 

Input  : n = 69354
Output : Yes

Input  : n = 234567876799333
Output : No

Input  : n = 3635883959606670431112222
Output : No

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String str = "69354";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str)
	{
		int sum=0;
		int i=0;
		while(i<str.length())
		{
			int last=(int)str.charAt(i)-48;
			sum+=last;
			i++;
		}
		if(sum%9==0)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}


