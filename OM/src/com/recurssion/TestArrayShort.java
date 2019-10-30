/**
 * 
 */
package com.recurssion;

/**
 * @author Amit Jha
 *
 */
public class TestArrayShort {

	public static int arrayRecShort(int[] a,int index){
		if(index==1)
			return 1;
		
		return (a[index-1]<a[index-2])?0:arrayRecShort(a, index-1);
	}
	public static void main(String[] args) {
		int[] a={1,2,3,5};
		int index=a.length;
		int result=arrayRecShort(a,index);
		System.out.println(result);//1 sorted and 0 not sorted

	}

}
