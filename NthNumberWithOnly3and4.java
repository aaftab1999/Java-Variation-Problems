package Variation;

public class NthNumberWithOnly3and4 {
	
	/*
	 * to find the n'th number which consist only 3 & 4 
	 * the number series looks like this
	 * 3 4 33 34 43 44 333 334 343 344 433 434
	 * 
	 * your task is to print the series upto n'th count 

	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int count=0;
		for (int i = 1; ; i++) {
			
			int num=i;
			while (num>0) 
			{
				int last=num%10;
				if( last==3 || last==4)
				{
					
					num/=10;
					
					
				}
				else 
					break;
				
			}
			if(num==0)
			{count++;
				System.out.println(i);
			}
			if(count==n)
				break;
			
		}
		

	}

}
