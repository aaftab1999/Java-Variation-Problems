package Variation;

public class MaxSumOfCircularSubArray {

	public static void main(String[] args) {
		int[] a= {8,-8,9,-9,10,-11,12};
		
		int mainMax=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < a.length; j++) 
			{
				
				for (int j2 = j; j2 <a.length; j2++) 
				{
					int sum=0;
					for (int k = j; k < j2; k++) 
					{
						sum+=a[k];
					}
				
				if(sum>max)
					max=sum;
				}
				
			}
		
		if(max>mainMax) 
			mainMax=max;
		 int temp=a[a.length-1];
		 for (int j = a.length-1; j >0; j--)
		 {
			 a[j]=a[j-1];
			
		}
		 a[0]=temp;
		}
		System.out.println(mainMax);
	}

}
