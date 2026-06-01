package com.threadsExample;

public class Thread2 implements Runnable{

	public void run(){
		
		System.out.println("Now the thread is running ...");
	}
	
	public static void main(String[] args) {
		
		Runnable r1 = new Thread2();
		Thread t1 = new Thread(r1, "My new thread");
		t1.start();
		System.out.println(t1.getName());
	}
}
