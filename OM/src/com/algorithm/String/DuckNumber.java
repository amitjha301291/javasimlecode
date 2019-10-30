/**
 * 
 */
package com.algorithm.String;

import java.io.IOException;

/**
 * @author Amit Jha
 * 
 * Check Whether a number is Duck Number or not
A Duck number is a number which has zeroes present in it, but there should be no zero 
present in the beginning of the number. For example 3210, 8050896, 70709 are all duck numbers whereas 02364, 03401 are not.
The task is to check whether the given number is a duck number or not.
 *
 */

/*Examples :

Input : 707069
Output : It is a duck number.
Explanation: 707069 does not contains zeros at the beginning.

Input : 02364
Output : It is not a duck number.
Explanation: in 02364 there is a zero at the beginning of the number.*/
public class DuckNumber {
	// Function to check whether 
    // the given number is duck number or not.
    static int check_duck( String num)
    {
      // Length of the number(number of digits)
        int len = num.length(); 
        int count_zero = 0 ; 
        char ch;
  
        for(int i = 1;i < len ;i++)
        {
            // Checking for a digit whether it is a '0' or not
            ch=num.charAt(i); 
            if(ch=='0')
                count_zero++;
        }  
        return count_zero ;
    }
     
 
    // Driver Method
    public static void main(String args[])throws IOException
    {
        String num1 = "1023"; 
         
        // extracting the first digit
        char first_digit1 = num1.charAt(0); 
         
        // checking number1
        if( check_duck(num1) > 0 && first_digit1 != '0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }

}
