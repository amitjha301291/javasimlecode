/**
 * 
 */
package com.pattern.number;

/**
 * @author Amit Jha
 *
 */
public class NumberPattern {

	public static void pattern1(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
				
			}
			System.out.println("");
		}
	}
	public static void pattern2(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
				
			}
			System.out.println("");
		}
	}
	
	public static void pattern3(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
				
			}
			System.out.println("");
		}
		
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
				
			}
			System.out.println("");
		}
	}
	
	public static void pattern4(int n){
		for(int i=n;i>=1;i--){
			for (int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void pattern5(int n){
		for(int i=n;i>=1;i--){
			for (int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		//pattern1(4);
		//pattern2(4);
		pattern5(4);

	}

}
