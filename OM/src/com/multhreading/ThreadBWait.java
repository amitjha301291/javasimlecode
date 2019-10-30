/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
public class ThreadBWait extends Thread{
	
	int total=0;
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child thread start notification");
			for (int i=0;i<5;i++)
			{
				total+=i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}

}
