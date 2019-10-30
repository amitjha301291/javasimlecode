/**
 * 
 */
package com.multhreading.executer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Amit Jha
 *
 */
public class Counter implements Callable {

    private static final int THREAD_POOL_SIZE = 2;

    // method where the thread execution takes place
    public String call() {
        return Thread.currentThread().getName() + " executing ...";
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        // create a pool of 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        Future future1 = executor.submit(new Counter());
        Future future2 = executor.submit(new Counter());
        Future f3=executor.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Checking what it will return in future");
				
			}
		});

        System.out.println(Thread.currentThread().getName() + " executing ...");

        //asynchronously get from the worker threads
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(f3.get());

    }
}