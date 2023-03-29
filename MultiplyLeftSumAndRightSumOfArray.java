package Variation;

public class MultiplyLeftSumAndRightSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,7,2,1,1};
		int mid=(a.length)/2;
		int leftSum=0, rightSum=0;
		for (int i = 0; i <mid; i++) {
			leftSum+=a[i];
		}
		for (int i = mid; i <a.length; i++) {
			rightSum+=a[i];
		}
		System.out.println(rightSum*leftSum);

	}

}
