/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
import java.util.concurrent.CountDownLatch;

public class EvenOddThreads {
	public static void main(String[] args)  {
		try{
		CountDownLatch latch = new CountDownLatch(1);
		Thread even = new NumberPrinter(latch, true);
		Thread odd = new NumberPrinter(latch, false);
		even.start();
		odd.start();

		even.join();
		odd.join();
		} catch(Exception e) {}
	}
	public static void main1()
	{}
}

class NumberPrinter extends Thread {
	CountDownLatch latch;
	boolean isEven;

	NumberPrinter(CountDownLatch o, boolean isEven) {
		this.latch = o;
		this.isEven = isEven;
	}

	@Override
	public void run() {
		if (isEven) {
			try {
				for (int i = 0; i <= 100; i++) {
					synchronized (latch) {
						System.out.print(" " + 2 * i);
						latch.countDown();
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		} else {
			try {
				latch.await();
				for (int i = 0; i < 100; i++) {
					synchronized (latch) {
						System.out.print(" " + (2 * i + 1));
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
