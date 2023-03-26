package Variation;

import java.util.ArrayList;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdbace";
		ArrayList<Character> al=new ArrayList<Character>();
		for (int i = 0; i < s1.length(); i++)
		{int count=0;
			for(int j=0; j<s1.length(); j++)
			if(s1.charAt(i)==s1.charAt(j))
				count++;
			
			if(count==1)
			{
				al.add(s1.charAt(i));
				
			}
			
		}
		System.out.println(al.get(al.size()-1));

	}

}
