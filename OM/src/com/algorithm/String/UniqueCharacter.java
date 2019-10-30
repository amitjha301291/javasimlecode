/**
 * 
 */
package com.algorithm.String;

/**
 * @author Amit Jha
 *
 */
public class UniqueCharacter {

	public static void unique(String str){
		int length=str.length();
		char ch=0;
		int [] arr=new int[123];
		for(int i=0;i<length;i++){
			ch=str.charAt(i);
			//System.out.println(ch);
			//System.out.println(ch);
			arr[ch]=1;
			//System.out.println(arr[ch]);
		}
		
		int i=0;
		while(i<123){
			if(arr[i] !=0){
				System.out.print((char)i);
			}
			i++;
		}
		
		
	}
	
	public static void main(String[] args) {
		/*char A=65;  //A=65,a=97,z=122
		char Z=67;
		char a='a';
		char z=122;
		System.out.println(A);
		System.out.println(Z);
		System.out.println(a);
		System.out.println(z);*/
		unique("abca");

	}

}
