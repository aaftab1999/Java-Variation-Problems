package Variation;

public class ReplaceConsonants {
	
/*
ProblemStatement
Given a string which contains lowercase English alphabets. The task is to replace each consonant with the next immediate consonant that comes in English alphabets.
Let’s say we have to replace character a    , it will be replaced by b    . Another example, let’s say we have to replace character d    , the next immediate consonant is f    , hence d    will be replaced by f    .
Note: If the character is ‘z’, then look circularly in English alphabets for the next consonant, i.e. replace it with ‘b’.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s = "geeksforgeeks";
		myCode(s);
	}
	//EndOfMainMethod
	private static void myCode(String s) 	
	{
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch=='z')
			ch='b';
			else if(!vowel(ch))
			{
				char ch1=(char)(ch+1);
				if(vowel(ch1))
				{
					ch+=2;
				}
				else
				ch+=1;
			}
			System.out.print(ch);
		}
	}
	public static boolean vowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		return true;
		return false;
	}
}
/*
Input Given:
public static void main(String[] args) 
	{
		 String s = "geeksforgeeks";
		myCode(s);
	}

Expected Output:
heeltgosheelt

*/