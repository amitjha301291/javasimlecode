/**
 * 
 */
package com.multhreading.producerconsumer;

import java.util.Queue;
import java.util.Random;

/**
 * @author Amit Jha
 *
 */
/** * Producer Thread will keep producing values for Consumer * to consumer.
 * It will use wait() method when Queue is full * and use notify() method to send notification to Consumer * 
 * Thread. * * @author WINDOWS 8 * */
class Producer extends Thread 
{ 
	private Queue<Integer> queue; 
    private int maxSize; 

	public Producer(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					try {
						System.out.println("Queue is full, "
								+ "Producer thread waiting for "
								+ "consumer to take something from queue");
						queue.wait();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing value : " + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	} } 

