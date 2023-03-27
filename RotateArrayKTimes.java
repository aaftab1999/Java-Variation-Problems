package Variation;

import java.util.Arrays;

public class RotateArrayKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4,5,6};
		int k=2;
		
		for(int i=0; i<k;i++)
			rotate(a);
		System.out.println(Arrays.toString(a));

	}

	private static void rotate(int[] a) {
		int temp=a[0];
		for (int i = 0; i < a.length-2; i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		
	}

}
