/**
 * 
 */
package com.nagarro;

/**
 * @author Amit Jha
 *
 */
//java program to reverse a 
//subarray arr[0..k-1]
/*Input:
arr[] = {1, 2, 3, 4, 5, 6}
    k = 4

Output:
arr[] = {4, 3, 2, 1, 5, 6} */

public class ArrayReverse {

 // Reverse subarray a[0..k-1]
 static void reverse(int []a, int n, int k)
 {
     if (k > n)
     {
         System.out.println( "Invalid k");
         return;
     }
  
     // One by one reverse first 
     // and last elements of a[0..k-1]
     for (int i = 0; i < k / 2; i++)
     {
         int tempswap = a[i]; 
             a[i] = a[k - i - 1]; 
             a[k - i - 1] = tempswap;             
     } 
 }

 // Drive code
 public static void main(String args[])
 {
     int []a = {10, 2, 16, 4, 5, 6,7,8};
     int n = a.length, k = 5;
     reverse(a, n, k);
     for (int i = 0; i < n; ++i)
         System.out.print(a[i] + " ");
 }
}