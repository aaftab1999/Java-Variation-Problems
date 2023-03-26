package Variation;

import java.util.*;
public class GetAllKeysFromTreeMap {

/*
ProblemStatement
Write a program to get all keys from the given a Tree Map.
i/p :
o/p ;

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(22, "twotwo");
		tm.put(43, "fourtyThree");
		tm.put(1, "one");
		tm.put(9, "nine");
		tm.put(5, "five");
		myCode(tm);
	}
	//EndOfMainMethod
	private static void myCode(TreeMap<Integer, String> tm) 
	{
		//write code here
		Set<Integer> keys=tm.keySet();
		for(Integer key:keys)
		System.out.println(key);
	}
}


