/**
 * 
 */
package com.nagarro;

/**
 * @author Amit Jha
 *
 */
//121 is a palindrome
//123 is not a palindrome
public class NumberPalindrome {

	public static int reverse(int number)
	{
		int reverse=0;
		while (number!=0)
		{
			int digit =number%10;
			reverse=reverse*10+digit;
			number=number/10;
			
		}
		System.out.println(reverse+"  "+number);
		return reverse;
	}

	public static void main(String[] args) {
		int  reversec=reverse(1221);
		if(reversec==1221){
		System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		

	}

}
