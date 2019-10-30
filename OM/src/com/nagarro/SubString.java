/**
 * 
 */
package com.nagarro;

/**
 * @author Amit Jha
 *
 */
public class SubString {

	public static void subString(String string)
	{
		int len=string.length();
		int count=0;
		String sub;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				sub=string.substring(i, j);
				System.out.println(sub);
				count++;
			}
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str="abcd";
		
		subString(str);
	}

}
