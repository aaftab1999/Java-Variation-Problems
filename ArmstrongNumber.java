package Variation;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N=153;
int last=0;
int origin=N;
int sum=0;
while(N>0) 
{
	last=N%10;
	int cube=(int)Math.pow(last, 3);
	sum=sum+cube;
	N/=10;
	
	
}
if(sum==origin)
System.out.println("Armstrong Number");
else
	System.out.println("Not Armstrong Number");


	}

}
