package Variation;

public class CountOnFingers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=16;
		int count=5;
		int index=0;
		if(n<=5)
			System.out.println(n);
		else {
		while(true) {
				 
	         index=findOnfinger(n,count);
	         count=count+8;
	       
	         if(index!=0)
	        	 break;
	         }
			}
		System.out.println(index);

	}

	private static int findOnfinger(int n, int count) {
		
		
		for(int i=4;i>=1;i--) {
			count++;
			if(count==n)
				return i;
		}
		for(int i=2; i<=5; i++) {
			count++;
			if(count==n)
				return i;
			
		}
		
		return 0;
	}

}
