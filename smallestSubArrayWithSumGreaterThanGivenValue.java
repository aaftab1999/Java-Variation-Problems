package Variation;

public class smallestSubArrayWithSumGreaterThanGivenValue {
	
	/*to print smallest subarray whose sum is greater than the given value.
	 * The answer will always exist because the value is guaranteed to be greater 
	 * than sum of arrays element.
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,7,5,3,9,10};
		int value=9;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			int sum=a[i];
			int length=1;
			if(sum>value)
			{
				min=1;
				break;
			}
			else {
			for (int j = i+1; j < a.length; j++) {
				sum+=a[j];
				if(sum>value)
				{
					length+=j-i;
				
				if(length<min)
					min=length;
				}
			}
			}
			
			
		}
		
			System.out.println(min);
		
			
		

	}

}
