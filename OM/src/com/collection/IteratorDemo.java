/**
 * 
 */
package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Amit Jha
 *
 */
public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()){
			Integer I=(Integer)it.next();
			if(I%2==0){
				System.out.println("It is even "+I);
			}
			else{
				it.remove();
				System.out.println("It is ODD "+I);

			}
			
		}
		System.out.println("It is even "+al);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IteratorDemo [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
