package Variation;

import java.util.LinkedHashSet;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="computcer";
		String s2="cat";
		
		String s3="";
		
		for (int i = 0; i < s1.length(); i++) {
			int count=0;
			for (int j = 0; j < s2.length(); j++) 
			{
				
				if(s2.charAt(j)==s1.charAt(i)) {
					count++;
				    break;	
				}
				
			}
			if(count==0)
				s3+=s1.charAt(i);
			
		}
		System.out.println(s3);
		
	}

}
