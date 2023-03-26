package Variation;


public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		
		int sq=num*num;
		
		String sqStr=Integer.toString(sq);
		String numStr=Integer.toString(num);
		
		System.out.println(sqStr.endsWith(numStr));

	}

}
