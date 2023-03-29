package Variation;

public class duplicateUndergivenconstraints {

	/*find duplicates under given constraints
	 * Given a sorted array A[] having 10 elements which contains 6 different numbers
	 * in which only 1 number is repeated five times. Your task is to find the 
	 * duplicate number using two comparisons only.
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {1,5,7,8,8,8,8,8,9,10};
		
		if(a[4]==a[5])
			System.out.println(a[4]);
		else if(a[0]==a[1]) {
			System.out.println(a[0]);
		}
		else
			System.out.println(a[9]);
			
		

	}

}
