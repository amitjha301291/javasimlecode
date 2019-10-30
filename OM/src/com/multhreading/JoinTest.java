/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
public class JoinTest implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
			
		{ 
			
			System.out.println("Ram Thread"+i+Thread.currentThread().getName());
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
		public static void main(String[] args) throws InterruptedException {
			JoinTest myr=new JoinTest();
			Thread t1=new Thread(myr,"Amit");
			//Thread t2=new Thread(myr,"Ravi");
			t1.start();
			//t2.start();
			//t1.join();
			t1.interrupt();
			
			
			for(int i=0;i<5;i++)
			{
				
				System.out.println("Sita Thread"+i);
			}
			

		}

}
