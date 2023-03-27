package Variation;

import java.util.ArrayList;

public class primeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=250;
		ArrayList<Integer> al=new ArrayList<Integer>();
		int i=2;
		while (n>1) {
			if(n%i==0)
			{
				al.add(i);
				n=n/i;
			}
			else
				i++;
			
		}
		System.out.println(al);

	}

}
