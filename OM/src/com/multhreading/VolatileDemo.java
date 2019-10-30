/**
 * 
 */
package com.multhreading;

import java.io.ObjectInputStream.GetField;

/**
 * @author Amit Jha
 *
 */
public class VolatileDemo implements Runnable{

	 int count=0;
	
	@Override
	public void run() {

     for(int i=1;i<10000;i++){
    	 count++;
    	 System.out.println(count);
     }
		
	}
	
	/*public int getCount(){
		return count++;
	}*/
	
	public static void main(String[] args) {
		VolatileDemo vd=new VolatileDemo();
		Thread t1=new Thread(vd);
		Thread t2=new Thread(vd);
		t1.start();
		t2.start();
		
		

	}

}
