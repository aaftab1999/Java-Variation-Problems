package Variation;


public class RecursivelyRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccbzccbca";
		
		while(checkAdjDuplicateRemove(s)==false) {
		String s2="";
		for(int i=0; i<s.length(); i++) 
		{
			int count=0;
			int j=i+1;
			loop:
		   for (; j<s.length(); j++)
		{
			   if(s.charAt(i)!=s.charAt(j))
			   {
				   break loop;
			   }
			   else
				   count++;
			
		}
			if(count==0)
				s2+=s.charAt(i);
			i=j-1;
		}
		s=s2;
		}
		if (s.length()==0)
		{
			System.out.println("empty");
		}
		else
			System.out.println(s);

	}

	private static boolean checkAdjDuplicateRemove(String s) {
		for (int i = 0; i < s.length()-1; i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				return false;
		}
		
		return true;
	}

}
