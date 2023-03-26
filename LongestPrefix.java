package Variation;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa= {"GeeksforGeeksQuiz","Geeksfor","geeksforG","GeeksforGeeksQ"};
		
		String temp=sa[0];
		String s1="";
		for (int i = 0; i < temp.length(); i++) 
		{
			int count=0;
			
			for (int j=0; j < sa.length; j++) 
			{
				if(i < sa[j].length())
				{
					if (sa[j].charAt(i)==temp.charAt(i))
					{
						count++;
					}
				}
			}
			if(count==sa.length)
				s1=s1+temp.charAt(i);
			else
				break;
			
		}
		System.out.println(s1);

	}

}
