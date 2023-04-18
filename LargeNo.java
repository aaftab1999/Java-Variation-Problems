package Variation;

public class LargeNo {
	
/*
ProblemStatement
Given a number, the task is that we divide number by 3. The input number may be large and it may not be possible to store even if we use long long int.
Examples: 
 

Input  : n = 769452
Output : Yes

Input  : n = 123456758933312
Output : No

Input  : n = 3635883959606670431112222
Output : Yes
*/ 

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String str = "1332";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String s)
	{
		int store=0;
		for(int i=0; i<s.length(); i++)
		{
			int num=Integer.parseInt(s.charAt(i)+"");
			store+=num;
		}
		if(store%3==0)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}

/*
AllignYourCode (ctrl+a)UpdateOnServer (ctrl + s)RunServer1RunServer2S1S2S3S4 Done
OutPut
Your code output and expected output are not matching
Input Given:
public static void main(String[] args) 
	{   	
		String str = "1332";
		 myCode(str);
	}

Expected Output:
Yes

*/