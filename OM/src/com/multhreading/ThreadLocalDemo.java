/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
public class ThreadLocalDemo {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			protected Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get()); // abc
		tl.set("Durga");
		System.out.println(tl.get()); // Durga
		tl.remove();
		System.out.println(tl.get()); // abc
	}
}
