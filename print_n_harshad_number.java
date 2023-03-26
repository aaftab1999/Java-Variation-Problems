package Variation;


public class print_n_harshad_number {
	

/*
ProblemStatement
Print n Harshad numbers starting from m.(Take value of n and m from user).In recreational 
mathematics, a harshad number in a given number base, is an integer that is divisible by the 
sum of its digits when written in that base.Example: Number 200 is a Harshad Number because 
the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. Number 171 is a Harshad 
Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9

*/
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int m=100;
		int n=20;
		myCode(m,n);
	}
	//EndOfMainMethod
	private static void myCode(int start,int count) 
	{
		//write code here
		int count1=0;
		for(int i=start; i<start+100; i++)
		{
			int origin=i,j=i;
			int sum=0, last=0;
			while(j>0)
			{
				last=j%10;
				sum+=last;
				j/=10;
			}
			if(origin%sum==0)
			{
				count1++;
				System.out.println(origin+" harshad number");
			}
			if(count1==count)
			break;
		}
	}
}





