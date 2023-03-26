package Variation;

public class MakingElementsDistinct {

	
	/*
	 * Given a sorted array. We need to make array elements distinct by increasing values 
	 * and keeping the array sum minimum
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,2,2,2,2,3,5,6,13,13};
		
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j<i; j++) {
				
				if(a[i]==a[j])
				{
					a[i]+=1;
				}
				
				
			}
			sum+=a[i];
		
		}
		
		System.out.println(sum);

	}

}
