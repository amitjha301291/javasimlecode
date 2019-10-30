/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
public class YieldTest implements Runnable{


public void run()
{
	for(int i=0;i<5;i++)
		
	{
		Thread.yield();
		System.out.println("Chield Thread"+i);
	}
}
	public static void main(String[] args) {
		YieldTest myr=new YieldTest();
		Thread t=new Thread(myr);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("Parent Thread"+i);
		}
		

	}

}
