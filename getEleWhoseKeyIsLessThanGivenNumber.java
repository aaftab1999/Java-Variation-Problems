package Variation;

import java.util.*;
public class getEleWhoseKeyIsLessThanGivenNumber {
/*
ProblemStatement
Write a program to get Element Whose Key Less Than Given Number.
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(2, "two");
		hm.put(4, "four");
		hm.put(1, "one");
		hm.put(3, "three");
		hm.put(5, "five");
		int num=3;
		myCode(hm,num);
	}
	//EndOfMainMethod
	private static void myCode(HashMap<Integer, String> hm,int num) 
	{
		//write code here
		for(Map.Entry<Integer, String> entry: hm.entrySet())
		{
			if(entry.getKey()<num)
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}

