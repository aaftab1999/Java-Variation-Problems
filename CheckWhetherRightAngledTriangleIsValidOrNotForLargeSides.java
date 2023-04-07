package Variation;
import  java.math.*;
public class CheckWhetherRightAngledTriangleIsValidOrNotForLargeSides {
	

/*
ProblemStatement
Given three integers a, b and c as triplets. Check if it is possible to make right angled triangle or not. Print Yes if possible, else No. 10-18 <= a, b, c <= 1018 
Examples: 
 

Input: 3 4 5
Output: Yes
Explanation:
Since 3*3 + 4*4 = 5*5
Hence print "Yes"For a right angled triangle to be valid it must satisfies the following criteria:- 
 

a, b and c should be greater then 0. 
 
Sum of any two sides of triangle must be greater than the third side. 
 
Pythagorean Theorem i.e., a2 + b2 = c2. 
 
First two conditions can be easily checked but for third condition we have to take care of overflow. Since a, b and c can be large so we can’t compare them directly unless we use python or BigInteger library in Java. For languages like C and C++, we have to reduce the expression in fraction form. 
\implies a^2 + b^2 = c^2 \implies a^2 = c^2 - b^2 \implies \dfrac{a}{c-b}=\dfrac{c+b}{a}  
Before comparing the fraction we need convert them in simplified form by dividing the numerator and denominator by gcd of both of them. Now compare both numerator and denominator of both the fractions of LHS and RHS such that if both would become same then it signifies the valid right angled triangle otherwise not.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		long a = 4, b = 3, c = 5;
		myCode(a,b,c);
	}
	//EndOfMainMethod
	private static void myCode(long a,long b,long c)
	{
		BigInteger a1=BigInteger.valueOf(a), a2=BigInteger.valueOf(b), a3=BigInteger.valueOf(c);
		if((a1.multiply(a1).add(a2.multiply(a2))).equals(a3.multiply(a3)))
		System.out.println("Yes");
		else
		System.out.println("No");
		
	}
}

/*
Input Given:
public static void main(String[] args) 
	{ 
		long a = 4, b = 3, c = 5;
		myCode(a,b,c);
	}

Expected Output:
Yes
*/
