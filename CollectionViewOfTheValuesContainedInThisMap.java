package Variation;

import java.util.*;  
public class CollectionViewOfTheValuesContainedInThisMap {

	
	
	     public static void main(String args[]){  
	 
	  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
	    hash_map.put(1,"Red");
	  hash_map.put(2,"Green");
	  hash_map.put(3,"Black");
	  hash_map.put(4,"White");
	  hash_map.put(5,"Blue");
	  hash_map.put(5,"Bl");
	       
	   // checking collection view of the map
	   System.out.println("Collection view is: "+ hash_map.values());
	 }
	}
