/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Amit Jha--Nagarro question
 *Check if strinput1 is a subString of strinput2
 */
public class SubStringDemo {

	public static boolean isSubString(String strinput1,String strinput2)
	{
		int length1=strinput1.length();
		int length2=strinput2.length();
		
		List<String> listSuvString=collectionOfSubstring(strinput2,length2,0);
		
		 if(listSuvString.contains(strinput1)){
			return true;
		}
		 else if(strinput2!=null && strinput2.equals(strinput1))
		{
			return true;
		}
		else return false;
	}
	/**
	 * @param strinput2
	 * @param length2
	 * @param i
	 * @return
	 */
	private static List<String> collectionOfSubstring(String strinput2, int length2,int i) 
	{
		List<String> listString=null;
		List<String> listofString=new ArrayList<String>();
		if(length2==i)
		return listString;
		else{
			listString=new LinkedList<String>();
			for(int j=0;j<length2;j++)
			{
				for(int k=j+1;k<=length2;k++)
				{
					String substr=strinput2.substring(j, k);
					listString.add(substr);
					//System.out.println(listString);
				}
				
				
			}
			listofString.addAll(listString);
			System.out.println(listofString);
			
		}
		return listofString;
	}
	public static void main(String[] args) {
		
		System.out.println(isSubString("bc","cba"));
	}

}
