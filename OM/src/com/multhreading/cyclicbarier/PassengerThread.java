/**
 * 
 */
package com.multhreading.cyclicbarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Amit Jha
 *
 */
public class PassengerThread extends Thread {
	
	private int duration;
	private CyclicBarrier barrier;
	
	public PassengerThread(int duration,CyclicBarrier barrier,String name){
		super(name);
		this.duration=duration;
		this.barrier=barrier;


	}

	public void run(){
		
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"  is arrived.");
			int await=barrier.await();
			if(await==0){
				System.out.println("All four passenger has arrived so cab is going to move");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
