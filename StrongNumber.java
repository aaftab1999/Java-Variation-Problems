package Variation;


public class StrongNumber {

	/*
	 * Strong Number are the number whose sum of factorial of digits is equal to the original number
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=145;
		int origin=n;
		int last=0, sum=0;
		while(n>0) {
			last=n%10;
			int fact=factorial(last);
			
			sum+=fact;
			n/=10;
			
		}
		if(sum==origin)
			System.out.println("yes");
		else
			System.out.println("no");

	}

	private static int factorial(int last) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1; i<=last; i++) {
			fact*=i;
			
			
		}
		return fact;
		
	}

}
