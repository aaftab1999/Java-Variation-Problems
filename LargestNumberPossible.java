package Variation;


import java.util.Arrays;


public class LargestNumberPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,5,52,5,51,57,10,3,1,30};
		//        95552515036330     
		Arrays.sort(a);
				
				System.out.println(Arrays.toString(a));
		for (int i =0; i<a.length; i++) 
		{
			
			for (int j = i+1; j<a.length; j++)
			{int am=max(a[i]);
				int bm=max(a[j]);
			  if(bm>am)
			  {
				 swap(a,i,j);	 
						
			  }
			  if(bm==am)
			  {
				  
			  }
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			
		}

	}

	private static int max(int i) {
		int temp=i, last=0;
		while(temp>0) 
		{
			last=temp%10;
			temp/=10;
		}
		
		
		return last;
	}
	
	public static void swap(int[] a, int i, int j) {
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
}

