package Variation;
import java.util.*;

public class PrintUniqueCharactersOfBothString {
	/*Given two strings A and B. Find the characters that are not common in the
	 * two strings.
	 * 
	 * Eg:-
	 *  String s="geeksforgeeks";
         String s1="geeksquiz";
         Output= fioqruz
         
         Explanation
         The above characters of output are either in s or s1 but not in both.
	 * */

	private static final String ArrayList = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="geeksforgeeks";
         String s2="eeksquiz";
         
         TreeSet<Character> ts=new TreeSet<>();
         for (int i = 0; i < s1.length(); i++)
         {
        	 if (!s2.contains(s1.charAt(i)+""))  //concatenated because string cannot be compared to 
        		                                 // char.
      				ts.add(s1.charAt(i));
         }
         for (int i = 0; i < s2.length(); i++)
         {
        	 if(!s1.contains(s2.charAt(i)+""))
        		 ts.add(s2.charAt(i));
			
		}
         for(Character data:ts)
         System.out.print(data);
        
       
	}

}
