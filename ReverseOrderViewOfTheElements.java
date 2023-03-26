package Variation;

import java.util.*;
public class ReverseOrderViewOfTheElements {
	
	
/*
ProblemStatement
Write a program to create a reverse order view of the elements contained in a given tree set.

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(6);
		set.add(8);
		set.add(4);
		set.add(1);
		myCode(set);
	}
	//EndOfMainMethod
	public static void myCode(TreeSet<Integer> set) 
	{
		//write code here
		Iterator<Integer> it=set.descendingIterator();
		while(it.hasNext())
		System.out.println(it.next());
//		System.out.println();
//		Iterator it2=set.iterator();
//		while(it2.hasNext())
//			System.out.println(it2.next());
		
		
		
	}
}

