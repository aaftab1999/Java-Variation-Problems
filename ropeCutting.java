package Variation;

import java.util.*;

public class ropeCutting {
	

/*
ProblemStatement
You are given N ropes. A cut operation is performed on ropes such that all of them are reduced by the length of the smallest rope. Display the number of ropes left after every cut operation until the length of each rope is zero.

Input : arr[ ] = {5, 1, 1, 2, 3, 5} 
Output : 4 3 2 
Explanation: In the first operation, the 
minimum ropes are 1 So, we reduce length 1 
from all of them after reducing we left with 
4 ropes and we do the same for rest. 
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			5, 1, 1, 2, 3, 5
		}
		;
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		ArrayList<Integer> al=new ArrayList<>();
		for (Integer data : a) {
			al.add(data);
		}
		Collections.sort(al);
		
		for (Integer data : al) {
			
			for (int i = 0; i < al.size(); i++) {
			  Collections.replaceAll(al, data, data-al.get(i));
				
			}
			
			jjj
		}
		
		
		System.out.println(al);
	}
}



