/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *By implementing Runnable interfce
 */
public class MyRunnable implements Runnable {
	
public void run(){
	for(int i=1;i<5;i++){
		//System.out.println("Runnable running");
		System.out.println("Run By  "+Thread.currentThread().getName());

		
	}
	
}
	
	public static void main(String[] args) {
		MyRunnable myobj=new MyRunnable();
		/*Thread thread=new Thread(myobj);
		thread.setName("Amit");
		thread.start();*/
		
		Thread one=new Thread(myobj);
		Thread two=new Thread(myobj);
        Thread three=new Thread(myobj);
        one.setName("AMIT");
        two.setName("AMITsec");
        three.setName("Amitthree");
        one.start();
        two.start();
        three.start();

	}

}
