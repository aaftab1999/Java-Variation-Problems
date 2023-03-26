package Variation;

import java.util.*;
public class stackUsingArrayList {
	

/*
ProblemStatement
write a program ti implement Stack using ArrayList
i/p :
o/p : 
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		mystack m=new mystack();
		m.add(5);
		m.add(10);
		m.add(15);
		m.print();
		m.pop();
		m.print();
	}
	//EndOfMainMethod
}
class mystack
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	public void add(int data)
	{
		al.add(data);
	}
	public void print()
	{
		System.out.println(al);
	}
	public void pop()
	{
		if(al.size()>0)
		al.remove(al.size()-1);
		else
		{
			System.out.println("stack is empty");

		}
	}
}

