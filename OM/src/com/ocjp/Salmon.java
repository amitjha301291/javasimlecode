/**
 * 
 */
package com.ocjp;

/**
 * @author Amit Jha
 *
 */
public class Salmon extends Thread {
public static long id;

	public void run() {
		for (int i = 0; i < 4; i++) {
			// insert code here
			if (i == 2 && id == Thread.currentThread().getId()) {
				new Thread(new Salmon()).start();
				//throw new Error();
			}
			System.out.print(i + " ");
		}
	}
 public static void main(String[] args) {
 Thread t1 = new Salmon();
 id = t1.getId();
t1.start();
// t1.run();
 } }
