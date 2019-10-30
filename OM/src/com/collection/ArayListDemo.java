/**
 * 
 */
package com.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

/**
 * @author Amit Jha
 *
 */
public class ArayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Sr");
		System.out.println(al);
		al.add(0, "5");
		System.out.println(al);
		al.remove("Sr");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		

		


		

	}

}
