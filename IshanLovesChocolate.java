package Variation;

import java.util.ArrayList;

/*
 * Ishan loves chocolates so he bought a packet of chocalate bar 
 * where each bar has a tastiness level given as per a[i].
 * Ishan can only eat first bar or the last bar at a time.Her sister demands that she wants 
 * the last bar.Him being greedy eats the bar which is more tastier.
 * What level of tastiness of bar will her sister eat?
 * 
 * */
public class IshanLovesChocolate {

	public static void main(String[] args) {
	int a[] = {5,3,1,6,9,0};
	ArrayList<Integer> al=new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		al.add(a[i]);
		
	}
	
	while (true)
	{
		if(al.size()==1)
			break;
		if(al.get(0)>al.get(al.size()-1))
			al.remove(0);
		else
			al.remove(al.size()-1);
		
	}
	System.out.println(al);

	}

}
