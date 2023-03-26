package Variation;

public class ManchhausenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5000;
		
		
		
		
		for(int i=1; i<=n;i++) {
			int sum=0;
			int temp=i;
		while (temp>0) {
			
			int last=temp%10;
			sum+=(int)Math.pow(last, last);
			temp/=10;
			
			
		}
		if(sum==i)
		System.out.println(i);
		}

	}

}
