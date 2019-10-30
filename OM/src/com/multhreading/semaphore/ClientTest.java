/**
 * 
 */
package com.multhreading.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Amit Jha
 *
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executorService=null;
		try {
			executorService = Executors.newCachedThreadPool();
			
			for(int i=1;i<=50;i++)
			{
				executorService.submit(new Runnable() {
					
					@Override
					public void run() {
						Connection.getConnection().connect();
						
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			if(executorService !=null)
				executorService.shutdown();
				
		}

	}

}
