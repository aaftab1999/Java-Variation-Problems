package Variation;


public class MagicalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		
		//for upperCase 155
		//for lowerCase 219
		String s2="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(155-ch);
				s2+=ch;
			}
			else if(ch>='a' && ch<='z')
		   {
			ch=(char)(219-ch);
			s2+=ch;
			}
			
		}
System.out.println(s2);
	}

}
