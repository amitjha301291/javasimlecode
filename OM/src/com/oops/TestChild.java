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
public class TestChild extends TestOverriding {
	int x=10;
	static int y=20;
	public static void m1(){
		System.out.println("Child");
	}
	
	@Override
	public List<Number> getList(){
		List<Number> l1=new ArrayList<Number>();
		l1.add(10);
		return l1;
	}


	
	
	
	
	
	
	
	public static void main(String[] args) {
		TestOverriding p=new TestOverriding();
		TestChild c=null;
		TestOverriding p1=null;
		//p.m1();
		//c.m1();
		p1.m1();
		//c.x;
		System.out.println(c.y);
		
		

	}

}
