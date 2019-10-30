/**
 * 
 */
package com.multhreading.producerconsumer;

/**
 * @author Amit Jha
 *
 */
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Random; 
/** * Simple Java program to demonstrate How to use wait, notify and notifyAll() * method in Java by solving producer consumer problem.
 *  * */ 
public class ProducerConsumerInJava 
 {
	public static void main(String args[]) {
		System.out.println("How to use wait and notify method in Java");
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> buffer = new LinkedList<Integer>();
		int maxSize = 10;
		Thread producer = new Producer(buffer, maxSize, "PRODUCER");
		Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
		producer.start();
		consumer.start();
	} }


