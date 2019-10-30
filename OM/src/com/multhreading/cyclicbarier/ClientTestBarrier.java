/**
 * 
 */
package com.multhreading.cyclicbarier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Amit Jha
 *
 */
public class ClientTestBarrier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

System.out.println(Thread.currentThread().getName()+"  has started");

CyclicBarrier barrier=new CyclicBarrier(4);

PassengerThread p1=new PassengerThread(1000, barrier, "AMIT");
PassengerThread p2=new PassengerThread(2000, barrier, "JHA");
PassengerThread p3=new PassengerThread(3000, barrier, "RAVI");
PassengerThread p4=new PassengerThread(4000, barrier, "KUNAL");

PassengerThread p5=new PassengerThread(1000, barrier, "ANNU");
PassengerThread p6=new PassengerThread(2000, barrier, "SOPHIA");
PassengerThread p7=new PassengerThread(3000, barrier, "DIKSHA");
PassengerThread p8=new PassengerThread(4000, barrier, "PRIYA");
p1.start();
p2.start();
p3.start();
p4.start();
p5.start();
p6.start();
p7.start();
p8.start();
System.out.println(Thread.currentThread().getName()+"  has finished");

	}

}
