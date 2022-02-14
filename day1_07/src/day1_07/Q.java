package day1_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Q {

	 public static void main(String[] args)
	    {
		 	String s = "I love code for code";
		 	
		 	char[] arr = s.toCharArray();
		 
	      //  String[] arr = { "I", "love", "geeks", "for", "geeks" };
	  
	        // create a new vector object of the same type
	        Vector<String> v = new Vector<String>();
	  
	          
	         // Use the addAll method of the Collections to add
	         // all array elements to the vector object
	           
	        Collections.addAll(v, arr);
	  
	        System.out.println("The vector is");
	        
	        // printing vector
	        System.out.println(v);
	    }
}
