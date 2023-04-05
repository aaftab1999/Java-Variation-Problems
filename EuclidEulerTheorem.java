package Variation;

public class EuclidEulerTheorem {
	
/*
ProblemStatement
According to Euclid Euler Theorem, a perfect number which is even, can be represented in the form (2^n - 1)*(2^n / 2) ))      where n is a prime number and 2^n - 1      is a Mersenne prime number. It is a product of a power of 2 with a Mersenne prime number. This theorem establishes a connection between a Mersenne prime and an even perfect number.
 

Some Examples (Perfect Numbers) which satisfy Euclid Euler Theorem are:

6, 28, 496, 8128, 33550336, 8589869056, 137438691328

Explanations:
1) 6 is an even perfect number.
So, is can be written in the form 
(22 - 1) * (2(2 - 1)) = 6
where n = 2 is a prime number and 2^n - 1 = 3 is a Mersenne prime number.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n=5;;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		System.out.println("Generating first few numbers satisfying Euclid Euler's theorem");
		for(int i=2; i<=n; i++)
		{
			if(findPrime(i))
			{
				print(i);
			}
			else
			continue;
		}
	}
	public static boolean findPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			return false;
		}
		return true;
	}
	public static void print(int i)
	{
		System.out.print("(2^"+i+" - 1) * (2^("+i+" - 1)) = ");
		System.out.println(((int)Math.pow(2,i)-1)*((int)Math.pow(2,i)/2));
	}
}

/*
Input Given:
public static void main(String[] args) 
	{   	
		int n=5;;
		 myCode(n);
	}

Expected Output:
Generating first few numbers satisfying Euclid Euler's theorem
(2^2 - 1) * (2^(2 - 1)) = 6
(2^3 - 1) * (2^(3 - 1)) = 28
(2^5 - 1) * (2^(5 - 1)) = 496

*/