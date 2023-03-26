package Variation;


public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00111101111110111";
	
		String[] sa=s.split("0");
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < sa.length; i++) 
		{
			if(sa[i].length()>max)
				max=sa[i].length();
		}
		if(max!=Integer.MIN_VALUE)
		System.out.println(max);

	}

}
