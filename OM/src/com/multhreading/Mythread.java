package com.multhreading;

public class Mythread extends Thread{

	public void run(){
		for(int i=0;i<=4;i++){
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		Mythread mythread=new Mythread();
        mythread.start();
		
		for(int i=0;i<=4;i++){
			System.out.println("Main Thread");
		}
	}

}
