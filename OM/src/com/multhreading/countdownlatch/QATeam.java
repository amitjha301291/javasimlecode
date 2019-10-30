/**
 * 
 */
package com.multhreading.countdownlatch;

/**
 * @author Amit Jha
 *
 */
public class QATeam extends Thread{
public QATeam(String name)
{
	super(name);
}
	
public void run(){
		
		System.out.println("Task assigned to QA team--"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Task finished  by QA  team--"+Thread.currentThread().getName());
		
	}
}
