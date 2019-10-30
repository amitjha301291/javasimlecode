/**
 * 
 */
package com.multhreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Amit Jha
 *
 */
public class DevTeam extends Thread{
	
	private CountDownLatch countdownLatch;
	
	public DevTeam(CountDownLatch countdownLatch,String name){
		super(name);
		this.countdownLatch=countdownLatch;
	}
	
	public void run(){
		
		System.out.println("Task assigned to development team--"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Task finished  by development team--"+Thread.currentThread().getName());
		countdownLatch.countDown();
	}

}
