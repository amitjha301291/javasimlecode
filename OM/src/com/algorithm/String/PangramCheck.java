/**
 * 
 */
package com.algorithm.String;

/**
 * @author Amit Jha
 *Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’
 are missing]
 */

/*solution:
	We create a mark[] array of Boolean type. We iterate through all the characters of our string and whenever we see a character we mark it. 
	Lowercase and Uppercase are considered the same. So ‘A’ and ‘a’ are marked in index 0 and similarly ‘Z’ and ‘z’ are marked in index 25.

	After iterating through all the characters we check whether all the characters are marked or not. If not then return false as this 
			is not a pangram else return true.*/
public class PangramCheck {

	  // Returns true if the string
    // is pangram else false
    public static boolean checkPangram (String str)
    {
        // Create a hash table to mark the 
        // characters present in the string
        // By default all the elements of 
        // mark would be false.
        boolean[] mark = new boolean[26];
 
        // For indexing in mark[]
        int index = 0;
 
        // Traverse all characters

        for (int i = 0; i < str.length(); i++)
        {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= str.charAt(i) && 
                    str.charAt(i) <= 'Z')
                         
                index = str.charAt(i) - 'A';
 
                // If lowercase character, subtract 'a'
                // to find index.
            else if('a' <= str.charAt(i) && 
                        str.charAt(i) <= 'z')
                             
                index = str.charAt(i) - 'a';
 
            // Mark current character
            mark[index] = true;
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
    }
 
    // Driver Code
    public static void main(String[] args) 
    {
        String str = "The quick brown fox jumps over the lazy dog";
 
        if (checkPangram(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str+ " is not a pangram.");
 
    }
}

