package Variation;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,4,2,5,6,7,8,9};

Arrays.sort(a);
int[] b=new int[a.length];
int i=0, j=a.length-1;
for(int k=0;k<a.length;i++,j--) 
{
	if(i<j) 
	{
		b[k++]=a[i];
		b[k++]=a[j];
		
	}
	else if(i==j)
	{
		b[k++]=a[i];
	}	
	
}
for (int j2 = 0; j2 < b.length; j2++) {
	System.out.print(b[j2]+" ");
	
}

	}

}
