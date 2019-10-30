/**
 * 
 */
package com.collection;

import java.util.TreeSet;

/**
 * @author Amit Jha
 *
 */
public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("A");
	ts.add("B");
	ts.add("C");
	System.out.println("A".compareTo("B"));
	System.out.println("B".compareTo("C"));
	System.out.println("A".compareTo("A"));
	System.out.println("Z".compareTo("A"));
	System.out.println("Z".compareTo("Y"));
   // ts.add(null);
	System.out.println(ts);


	}

}
