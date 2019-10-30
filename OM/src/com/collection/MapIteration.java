/**
 * 
 */
package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/**
 * @author Amit Jha
 *
 */
public class MapIteration {

	
	
	public static void main(String[] args) {
		Map<String,String> gfg=new HashMap<String,String>();
		
		  gfg.put("GFG", "geeksforgeeks.org"); 
	      gfg.put("Practice", "practice.geeksforgeeks.org"); 
	      gfg.put("Code", "code.geeksforgeeks.org"); 
	      gfg.put("Quiz", "quiz.geeksforgeeks.org");
	      
	      //Using for each loop
	      for(Map.Entry<String, String> entry: gfg.entrySet()){
	    	  System.out.println("MAP KEY"+entry.getKey()+"MAP VALUE"+entry.getValue());
	      }
	      
	      for(String key:gfg.keySet()){
	    	  System.out.println(key);
	      }
	      for(String value:gfg.values()){
	    	  System.out.println(value);
	      }
	      
	      // using iterators 
	        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator(); 
	          
	        while(itr.hasNext()) 
	        { 
	             Map.Entry<String, String> entry = itr.next(); 
	             System.out.println("Key = " + entry.getKey() +  
	                                 ", Value = " + entry.getValue()); 
	        } 
	        
	        
	       /* gfg.forEach((k,v) -> System.out.println("Key = "
	                + k + ", Value = " + v));*/ 

	}

}
