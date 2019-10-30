/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
public class ThreadAWait  {
	/**
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException
	{
		ThreadBWait t1=new ThreadBWait();
		t1.start();
		synchronized(t1)
		{
			System.out.println("Main thread trying to call wait");
			t1.wait();
			System.out.println("Main thread got notification");
			System.out.println(t1.total);
		}
	}

}
