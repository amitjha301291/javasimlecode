/**
 * 
 */
package com.object;

/**
 * @author Amit Jha
 *
 */
public class TestEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("abc");
		String s2=new String ("abc");
		String s4=new String("abc");
		String s3=null;
		if(s1.equals(s2)){
			System.out.println("true");
			System.out.println("Hashcode of s1 obj"+s1.hashCode());
			System.out.println("Hashcode of s2 obj"+s2.hashCode());
			System.out.println("Hashcode of s4 obj"+s4.hashCode());
		}
		else{ 
			System.out.print("false");
		}
		try{
		if(s3.equals(s2))// Here we will get nullPointerExcetion
		{
			
		}
		}catch(NullPointerException e){
			e.printStackTrace();
		}

	}

}
