/**
 * 
 */
package com.algorithm.search.problem;

/**
 * @author Amit Jha
 *Find the Missing Number
 *You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 *There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
 *Example:
 *I/P    [1, 2, 4, ,6, 3, 7, 8]
 *O/P    5
 *METHOD 1(Use sum formula)
Algorithm:
1. Get the sum of numbers 
       total = n*(n+1)/2
2  Subtract all the numbers from sum and
   you will get the missing number.
   Time Complexity: O(n)
 */
public class FindMissingNo {
	
	// Function to ind missing number
    static int getMissingNo (int a[], int n)
    {
        int i, total;
        /*sum of n natural no is n*(n+1)/2*/
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int a[] = {1,2,4,5,6};
		 int length=a.length;
	        int miss = getMissingNo(a,length);
	        System.out.println(miss);  

	}

}
