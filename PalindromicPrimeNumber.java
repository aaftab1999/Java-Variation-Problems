package Variation;

public class PalindromicPrimeNumber {

	//A palindromic prime is a prime number that is also a palindromic number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1000;

for(int i=2; i<=n; i++) {
	int j=2;
	for(; j<i; j++) {
		if(i%j==0)
			break;}

if(j==i)
{
int last=0;
int origin=i;
int store=0;
while(origin>0) {
	last=origin%10;
	
	store=store*10+last;
	origin/=10;
		
}
if(store==i)
	System.out.println(i);

}

}
	}

}
