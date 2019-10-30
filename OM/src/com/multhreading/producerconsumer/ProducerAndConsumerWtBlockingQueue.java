/**
 * 
 */
package com.multhreading.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Amit Jha
 *
 */
public class ProducerAndConsumerWtBlockingQueue {

	
	public static void main(String[] args) {
		BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
		Thread thread1=new Thread(new Producer2(queue));
		Thread thread2=new Thread(new Consumer2(queue));
		thread1.start();
		thread2.start();

	}

}

class Producer2 implements Runnable{
	BlockingQueue<Integer> queue=null;
	private int i=0;
	

	public Producer2(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true)
		{
			try {
				produce(i++);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	public void produce(int i) throws InterruptedException
	{
		System.out.println("Producer thread produced element i"+i);
		queue.put(i);
		Thread.sleep(1000);
	}
	
}

class Consumer2 implements Runnable{
	BlockingQueue<Integer> queue=null;
	private int i=0;
	

	public Consumer2(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true)
		{
			try {
				produce(i--);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	public void produce(int i) throws InterruptedException
	{
		System.out.println("Consumer thread Consumed  element "+queue.take());
		Thread.sleep(1000);
	}
	
}
