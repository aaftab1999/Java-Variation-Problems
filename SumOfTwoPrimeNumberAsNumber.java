package Variation;

import java.util.ArrayList;

public class SumOfTwoPrimeNumberAsNumber {
	
	/*if sum of two prime number is equal to the given number then print those pairs*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=34;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 2; i <=n; i++)
		{
			int tempNum=i;
			int j=2;
			for (; j <tempNum/2+1; j++) 
			{
				if(tempNum%j==0)
					break;
				
			}
			if(j==tempNum/2+1)
				al.add(tempNum);
			
		}
		
		for (int i = 0; i < al.size(); i++) {
			for (int j = i; j <al.size(); j++) {
				if(al.get(i)+al.get(j)==n)
					System.out.println(al.get(i)+ " "+ al.get(j));
				
			}
			
		}
	

		
	}

}
