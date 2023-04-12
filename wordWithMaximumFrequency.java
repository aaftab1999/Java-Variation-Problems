package Variation;

import java.util.ArrayList;
import java.util.Collections;

public class wordWithMaximumFrequency {
	

/*
ProblemStatement
You are given a string that is made up of words separated by spaces. Your task is to find the word with highest frequency, i.e. it appears maximum times in the sentence. If multiple words have maximum frequency, then print the word that occurs first in the sentence.


Input : S = "the devil in the sky"
Output : the 2
Explanation:
The frequency of the is 2, so we return "the" and
its frequency "2" i.e., "the 2"
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s="the devil in the sky";
		myCode(s);	
	}
	//EndOfMainMethod
	public static void myCode(String s) 
	{
		// write code here
		ArrayList<String> al=new ArrayList<>();
		String[] sa=s.split(" ");
		for(String data:sa)
		al.add(data);
		int max=0;
		String s1="";
		for(String data:al)
		{
			if(Collections.frequency(al,data)>max)
			{
				max=Collections.frequency(al,data);
				s1=data;
			}
		}
		System.out.println(s1+" "+max);
	}
}


/*
Input Given:
public static void main(String[] args) 
	{
		String s="the devil in the sky";
		myCode(s);	
	}

Expected Output:
the 2

*/
