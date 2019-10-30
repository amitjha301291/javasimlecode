/**
 * 
 */
package com.algorithm.sort;

/**
 * @author Amit Jha
 *
 */
/*Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

Sorting In Place: Yes*/
public class BubbleSort {
	  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
    
    //Same logic with differnet impl
    public static void bubbleShort(int[] array){
    	int length=array.length;
    	
    	for(int i=0;i<length-1;i++){
    		for(int j=0;j<length-i-1;j++){
    			
    			if(array[j]>array[j+1]){
    				swapNumbers(j, j+1, array);
    			}
    		}
    		 printNumbers(array);
    	}
    }
    
    //Same logic with differnet optimized way
    public static void bubbleShortopt(int[] array){
    	int length=array.length;
    	boolean swaped;
    	for(int i=0;i<length-1;i++){
    		swaped=false;
    		for(int j=0;j<length-i-1;j++){
    			
    			if(array[j]>array[j+1]){
    				swapNumbers(j, j+1, array);
    				swaped=true;
    			}
    		}
    		 printNumbers(array);
    		 //If internal loop will not swap the element we thought tht the element has already shorted.
    		if(swaped==false){
    			break;
    		}
    		
    		
    	}
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
       // bubble_srt(input);
        bubbleShort(input);
  
    }
}