/**
 * 
 */
package com.algorithm.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Amit Jha
 *
 */
public class ReverseAString {
	
	
	/*Converting String into Bytes: getBytes() method is used to convert the input string into bytes[].
	Method:
	1. Create a temporary byte[]  of length equal 
	   to the length of the input string.
	2. Store the bytes (which we get by using 
	   getBytes() method) in reverse order into 
	   the temporary byte[] .
	3. Create a new String abject using byte[] to
	   store result.*/
	public String reverseUsingByte(String input){
		 // getBytes() method to convert string 
        // into bytes[].
        byte [] strAsByteArray = input.getBytes();
 
        byte [] result = 
                   new byte [strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = 
             strAsByteArray[strAsByteArray.length-i-1];
        return new String(result);
	}
	
	public String reverseUsingChar(String input){  // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        
		for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
        return new String(try1);
    }
	
	public String reverseUsingCollection(String input){
		char[] hello = input.toCharArray();
	    List<Character> trial1 = new ArrayList<Character>();

	    for (char c: hello)
	        trial1.add(c);

	    Collections.reverse(trial1);
	    ListIterator li = trial1.listIterator();
	    while (li.hasNext())
	        System.out.print(li.next());
		
		
		return null;
	}
	


}
