package Variation;

public class StringWithNumbersAtItsEnd {

	/*
	 * Given string s that is appended with a number at last.
	 * The task is to check whether the length of string excluding that number is equal to that number.
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="geekssssss10";
		String number="";
		
		
		for (int i = s.length()-1; i >0; i--) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				
				number=s.charAt(i)+number;
				}
			else
				break;
		}
		
		int num=Integer.parseInt(number);
		
		if((s.length()-number.length())==num)
			System.out.println(1);
		else
			System.out.println(0);

	}

}
