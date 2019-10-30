/**
 * 
 */
package com.multhreading.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Amit Jha
 *
 */
public class Connection {
	
	private static Connection instance=new Connection();
	private int noofConnecton;
	private Semaphore semaphore=new Semaphore(10, true);
	private Connection(){
		
	}
	
	public static Connection getConnection()
	{
		return instance;
	}

	public void connect(){
		try{
			semaphore.acquire();
			synchronized(this){
				noofConnecton++;
				System.out.println("No of Connection--"+noofConnecton);
				}
			Thread.sleep(2000);
			synchronized(this){
				noofConnecton--;
				System.out.println("No of Connection--"+noofConnecton);
				}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(semaphore!=null)
				semaphore.release();
		}
		
	}
}
