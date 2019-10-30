/**
 * 
 */
package com.collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Amit Jha
 *
 */
public class VectorEnumerationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=10;i++){
			v.add(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Integer ie=(Integer)e.nextElement();
			if(ie%2==0){
				System.out.println("It is even "+ie);
			}
			
		}

	}

}
