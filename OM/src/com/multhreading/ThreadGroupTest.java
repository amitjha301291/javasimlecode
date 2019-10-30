/**
 * 
 */
package com.multhreading;

/**
 * @author Amit Jha
 *
 */
public class ThreadGroupTest extends Thread {

	ThreadGroupTest(ThreadGroup g, String name) {
		super(g, name);
		}
		public void run() {
		System.out.println("Child Thread");
		try {
		Thread.sleep(2000);
		}
		catch (InterruptedException e) {}
		}
	public static void main(String[] args) throws InterruptedException {
		/*System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		ThreadGroup tg=new ThreadGroup("Amit");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		ThreadGroup pg=new ThreadGroup(tg,"Child");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(pg.getParent().getName());*/
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		ThreadGroupTest t1 = new ThreadGroupTest(pg, "Child Thread 1");
		ThreadGroupTest t2 = new ThreadGroupTest(pg, "Child Thread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg.list();
		

	}

}
