
package com.multhreading;

/**
 * @author Amit Jha
 * 
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup()
				.getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread t1 : t) {
			System.out.println(t1.getName() + "-------" + t1.isDaemon());
		}
	}
}
