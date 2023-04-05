package Variation;

public class FaultyWiringAndBulbs {
/*
ProblemStatement
N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. "0 represents the bulb is off and 1 represents the bulb is on."

N=4
arr[] = { 0, 0, 0, 0 }
Output:  1
Explanation: 
From the given set of bulbs change
the state of the first bulb from off
to on ,which eventually turn the rest
three bulbs on the right of it.
*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			0,0,0,0,
		}
		;
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{  //01001
	  // 11111    4
		// write code here
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]==0)
			{
				count++;
				int j=i+1;
				for(; j<n;j++) 
				{
					if(a[j]==1)
					{
						count++;
						break;
					}
					
				}
				i=j;
			}
		}
		System.out.println(count);
	}
	
}

/*
Input Given:
public static void main(String[] args) 
	{
		int[] a= {1,0,0,1};
		int n=a.length;
		myCode(a,n);	
	}

Expected Output:
2

*/