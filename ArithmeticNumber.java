package Variation;
public class ArithmeticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sum of divisors of 6=1+2+3+6=12
		 * No of divisors of 6 =4
		 * dividing sum
		 * 
		 * */
		int n=8,count=0,sum=0;
		
		for (int i = 1; i <=n; i++) 
		{
			if(n%i==0)
			{
				sum+=i;
			count++;
			}
		}
		if(sum%count==0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
