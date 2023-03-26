package Variation;


public class SwapStringWO3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="good";
		String s2="morning";
		
	System.out.println("Before swap");
	System.out.println(s1);
	System.out.println(s2);
	
	s1=s1+s2;
	
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length(),s1.length());
	
	System.out.println("\nAfter swap");
	System.out.println(s1);
	System.out.println(s2);

	}

}
