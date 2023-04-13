package Variation;

public class ExtractIntegers {
	
/*
ProblemStatement
Extract the integers 
Given a string s, extract all the integers from s.

Example 1:

Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 
     3: Rishabh Gupta56"
Output: 1 2 3 56
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,3: Rishabh Gupta56";
		myCode(s);
	}
	//EndOfMainMethod
	public static void myCode(String s) 
	{
		String digits=s.replaceAll("[^0-9]++"," ");
		System.out.println(digits.trim());
	}
}

/*
Input Given:
public static void main(String[] args) {
		String s = "Hello1Hii2How3Are4You5";
        myCode(s);
	}

Expected Output:
1 2 3 4 5
*/