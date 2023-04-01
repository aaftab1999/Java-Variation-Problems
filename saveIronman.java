package Variation;

public class saveIronman {

/*
ProblemStatement
Jarvis is weak in computing palindromes for Alphanumeric characters.
While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
You are given a string S containing alphanumeric characters. Find out whether the string is a palindrome or not.
If you are unable to solve it then it may result in the death of Iron Man.\

Input : S = "I am :IronnorI Ma, i"
Output : YES
Explanation:
Ignore all the symbol and whitespaces S = "IamIronnorIMai".
Now, Check for pallandrome ignoring uppercase and lowercase
english letter.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s="I am :IronnorI Ma, i";
		myCode(s);
	}
	//EndOfMainMethod
	public static void myCode(String s) 
	{
		// write code here
		s=s.toLowerCase();
		//System.out.println(s);
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			s1+=s.charAt(i);
		}
		
		int j=0, k=s1.length()-1;
		
		while(j<=k)
		{
			if(s1.charAt(j)!=s1.charAt(k))
			break;
			j++;
			k--;
		}
		if(j>k)
		System.out.println("true");
		else
		System.out.println("false");
	}
}

