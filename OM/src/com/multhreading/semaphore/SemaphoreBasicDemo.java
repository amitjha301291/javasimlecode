/**
 * 
 */
package com.multhreading.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Amit Jha
 *
 */
public class SemaphoreBasicDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Semaphore semaphore=new Semaphore(1);//if you will give as 0 your program will be hange
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		semaphore.release();
		
		System.out.println(semaphore.availablePermits());
	}

}
