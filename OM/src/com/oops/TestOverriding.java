/**
 * 
 */
package com.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit Jha
 *
 */
public class TestOverriding {
	
	public static void m1(){
		System.out.println("Parent");
	}
	
	public List<? super Integer> getList(){
		List<Number> l1=new ArrayList<Number>();
		l1.add(10);
		return l1;
	}

}
