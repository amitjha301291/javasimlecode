/**
 * 
 */
package com.hackerranck;

/**
 * @author Amit Jha
 *
 */
import java.io.*;
import java.util.Arrays;


public class ArrayReverse {

	// Complete the reverseArray function below.
	static int[] reverseArray(int[] a) {
		try{
		int l = a.length;
		int[] reverse = new int[l];
		for (int i = 0; i <= l - 1; i++) {
			reverse[i] = a[l - i - 1];
			System.out.println(reverse[i]);
		}
		return reverse;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		throw new UnsupportedOperationException("just throwing");

	}
	
	static void reverseArray2(int inputArray[])
    {
        System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
        
        int temp;
        
        for (int i = 0; i < inputArray.length/2; i++) 
        {
            temp = inputArray[i];
            
            inputArray[i] = inputArray[inputArray.length-1-i];
            
            inputArray[inputArray.length-1-i] = temp;
        }
        
        System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
    }


    public static void main(String[] args) throws IOException {
     int[] a={10,20,3,4,5};
    	int [] reverse1=reverseArray(a);
    	for(int i=0;i<=reverse1.length-1;i++){
    		System.out.print(" "+reverse1[i]);
    	}
    }
}

