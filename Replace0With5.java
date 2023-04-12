package Variation;

public class Replace0With5 {
	
/*
	ProblemStatement
	Replace all 0's with 5 
	You are given an integer N. You need to convert all zeroes of N to 5.
	Input:
	N = 1004
	Output: 1554

	RestrictedKeyWordsInCode: "
*/
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int n = 700206;
			myCode(n);
		}
		//EndOfMainMethod
		public static void myCode(int n) 
		{
			int num=0;
			int multiple=1;
			while(n>0)
			{
				int last=n%10;
				if(last==0)
				{
					num=5*multiple+num;
				}
				else
				{
					num=last*multiple+num;
				}
				multiple*=10;
				n/=10;
			}
			System.out.println(num);
		}
	}

