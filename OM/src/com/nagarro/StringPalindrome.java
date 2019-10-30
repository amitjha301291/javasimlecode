/**
 * 
 */
package com.nagarro;

/**
 * @author Amit Jha
 *
 */
public class StringPalindrome {

	public static boolean checkpalindrome(String input){  // convert String to character array
        // by using toCharArray
        char[] ch = input.toCharArray();
        int length=ch.length;
        
		for (int i = 0; i<length/2; i++)
		{
			if(ch[i]!=ch[length-i-1])
				return false;
		}
           
       return true;
    }
	
	public static void main(String[] args) {
		String string="1221";//aba Aba abba
		
		String str=string.toLowerCase();
		
		System.out.println(checkpalindrome(str));
	}

}
