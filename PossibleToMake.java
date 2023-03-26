package Variation;

public class PossibleToMake {
	
	/*
	 * Find the maximum distance between common elements
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,1,2,2,2,1};
		int max=-1;
		for (int i = 0; i < a.length; i++) {
			int j = a.length-1;
			int diff=0;
			for (; j >i; j--) 
			{
				if(a[i]==a[j]) 
			 {
					diff=j-i;
					if (diff>max) 
					{
						max=diff;
						
						
					}
					break;
					
				}
				
				
			}
			
		}
		System.out.println(max);

	}

}
