package Variation;


public class TwistedPrimeNumber {

	/*
	 * A number is said to be twisted prime if it is a prime number and reverse of the number is also prime 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=22;
		int last=0;
		int origin=n;
		int store=0;
		while (origin>0) {
			last=origin%10;
			store=store*10+last;
			origin/=10;
			
		}
	if(ifprime(store) && ifprime(n))
		System.out.println("twisted ");
	else
		System.out.println("not");

	}

	private static boolean ifprime(int n) {
		for(int i=2; i<n/2;i++)
			if(n%i==0)
				return false;
		return true;
	}

}
