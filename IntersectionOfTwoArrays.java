package Variation;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class IntersectionOfTwoArrays {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,1,5,6,7};
		int[] b= {2,8,3,4,9,1,10,7,5};
		
		  
        HashSet<Integer> hs1=new HashSet<Integer>();
        HashSet<Integer> hs=new HashSet<Integer>();
        add(hs1,a);
        add(hs,b);
        hs1.retainAll(hs);
        System.out.println(hs1);
        
        
	}

	private static void add(HashSet<Integer> hs, int[] b) {
		// TODO Auto-generated method stub
		
	        for(int data:b)
	        hs.add(data);
	   
		
	}
	
	
}
	
		

//		LinkedList<Integer> al1=new LinkedList<Integer>();
//		LinkedList<Integer> al2=new LinkedList<Integer>();
//		LinkedList<Integer> intersect=new LinkedList<Integer>();
//		
//		for (Integer data : a) {
//			al1.add(data);
//			
//		}
//		for (Integer data : b) {
//			al2.add(data);
//			
//		}
//		
//		for(int i=0; i<al1.size();i++) {
//			for (int j = 0; j < al2.size(); j++)
//			{
//				if (al1.get(i)==al2.get(j)) 
//				{
//					intersect.add(al1.get(i));
//					al1.remove(i);
//					al2.remove(j);
//					i--;
//					j--;
//					break;
//					
//				}
//			}
//			
//		}
//		
//		System.out.println(intersect);
//		
		
		
	



//lms submit logic

/*
ProblemStatement
Write a Java program to find intersection of multiple arrays
i/p :
int[] a = {2, 3, 4, 7, 1};
int[] b = {4, 1, 9, 3, 5};
o/p :
3 4 1 


public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a = 
		{
			2, 3, 4, 7, 1
		}
		;
		int[] b = 
		{
			4, 1, 9, 3, 5
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		//write code here
		int i=0;
		int count=0;
		for(; i<a.length; i++)
		{
			int j=0;
			for(; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					count++;
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
		if(count==0)
		System.out.println("no element intersection");
	}
}

*/