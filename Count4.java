package Variation;


public class Count4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N=48, num=4;
int count=0;
for (int i = 1; i <=N; i++) 
{ 
	int last=0;
	int origin=i;
	while(origin>0)
	{
		last=origin%10;
		if(last==num) 
		{
			count++;
			break;
			}
		origin/=10;
	
	
     }
	//origin=0;
	
}
System.out.println(count);

	}

}
