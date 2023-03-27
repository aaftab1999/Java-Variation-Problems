package Variation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class lastApperarance {
	
	/*
	 * Given an array a of N integers that might contain duplicates, find the element 
	 * whose last appearance is earliest
	 * 
	 * 
	 * Explanation
	 * Below are indices of last apperance of all elements 
	 * 10 last occurs at 3
	 * 20 last occurs at 4
	 * 30 last occurs at 1
	 * 
	 * Output: 30
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,30,20,10,20};
		
		
		TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++)
		{
			map.put(a[i],i);
		}
		
		int min=378;
		int ele=-1;
	  for (int i : map.values()) 
	  {
		  if(i<min)
		  {
			  min=i;
			  ele=a[i];
			  
		  }
	 }
	  System.out.println(ele);
		
		
		}

}
