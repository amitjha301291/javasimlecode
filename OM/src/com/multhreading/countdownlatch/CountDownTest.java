/**
 * 
 */
package com.multhreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Amit Jha
 *
 */
public class CountDownTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Created countdownlatch for two threads
		CountDownLatch countDown=new CountDownLatch(2);
		
		//Created and start two threads
		
		DevTeam dev1=new DevTeam(countDown, "DEV-A");
		DevTeam dev2=new DevTeam(countDown, "DEV-B");
		
		dev1.start();
		dev2.start();
		
		//this will block here
		countDown.await();
		
		QATeam qateam=new QATeam("QA TEAM");
		qateam.start();

	}

}
