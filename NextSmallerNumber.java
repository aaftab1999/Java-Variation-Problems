package Variation;

import java.util.LinkedHashMap;

public class NextSmallerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,8,5,2,25};
		LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) 
		{    int j = i+1;
			for (; j < a.length; j++) 
			{
				if(a[j]<a[i]) {
				lhm.put(a[i], a[j]);
				break;}
				
			}
			if(j==a.length)
				lhm.put(a[i], -1);
			
		}
		//Iterator<E>
//		for (int i : lhm.keySet())
//		{
//			System.out.println(i);
//		}
		
		System.out.println(lhm);

	}

}
