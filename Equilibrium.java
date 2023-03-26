package Variation;

public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,3,2,5,4,1,2};
		
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum+=a[i];
		
		    int sum2=0;
		for (int j = i+1; j < a.length; j++)
		 {
			sum2+=a[j];
		 }
		if((sum-a[i])==sum2) {
			System.out.println(i+1);
			break;
		}
		}

	}

}
