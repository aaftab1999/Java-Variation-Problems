package Variation;

import java.util.*;
public class insertAGivenElementInPriorityQueue {

/*
ProblemStatement
Write a program to insert a given element into a priority queue
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		pq1.add(36);
		pq1.add(25);
		pq1.add(26);
		pq1.add(70);
		pq1.add(46);
		pq1.add(10); 
		int ele=100;
		myCode(pq1,ele);
	}
	//EndOfMainMethod
	public static void myCode(PriorityQueue<Integer> pq1,int ele) 
	{
		//write code here
		pq1.offer(ele);
		System.out.println(pq1);
	}
}

