package Variation;

import java.util.*;
public class InsertElementsAtSpecificPosition {

/*
ProblemStatement
Write a program to insert some elements at the specified position into a linked list
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(5);
		list2.add(2);
		list2.add(1);
		int pos=1;
		myCode(list1,pos,list2);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1,int pos,LinkedList<Integer> list2) 
	{
		//write code here
		list1.addAll(pos,list2);
		System.out.println(list1);
	}
}


