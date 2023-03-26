package Variation;



public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Big black bug bit a big black dog on his big black nose";
		
		String [] sa=s.split(" ");
	
		for (int i = 0; i < sa.length; i++)
		{
			int count=0;
			for (int j = i+1; j <sa.length; j++) 
			{
				if(sa[i].equals(sa[j]))
			    count++;
				
			}
			        if(count==1)
			    	System.out.println(sa[i]);
		
		}
		

	}

}
