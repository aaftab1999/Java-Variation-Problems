package Variation;

import java.util.ArrayList;

public class LongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="GeeksforGeeksQui", y="GeeksQuiz";
	/*	int max=0;
		for (int i = 0; i <x.length(); i++) 
		{
			for (int j = 0; j < y.length(); j++) 
			{int count=0;
				if(x.charAt(i)==y.charAt(j))
					for (int j2 = 0; j2 < y.length(); j2++) 
					{
						if (x.charAt(j2)==y.charAt(j2)) 
						{
							count++;
						}
					}
				if(count>max)
					max=count;
				
			}
			
		}
		System.out.println(max);
		
		*/
		
		ArrayList<String> al1=new ArrayList<String>();
		findSubString(x,al1);
		//System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<String>();
		findSubString(y,al2);
		
		
		int maxLen=0;
		String maxStr="";
		for (String string : al1)
		{
			if (al2.contains(string)) {
				if(maxLen<string.length()) {
				maxLen=string.length();
				maxStr=string;}
				
			}
		}
		System.out.println(maxStr+" "+maxLen);
		
		
		
	}

	private static void findSubString(String x, ArrayList<String> al) {
		
		for (int i = 0; i <x.length(); i++) {
			for (int j = i; j < x.length(); j++)
			{
				String temp="";
				for (int k = i; k <=j; k++) {
					temp+=x.charAt(k);
				}
				al.add(temp);
			}
			
		}
		
	}

}
