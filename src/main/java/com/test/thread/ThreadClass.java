package com.test.thread;

public class ThreadClass {

	//主线程和子线程
	public static void main(String[] args) {
		
		Runner1 r= new Runner1();
		r.start();
		for (int i=0; i<100; i++) {
			System.out.println("Main Thread:" + i);
		}
	}
}

class Runner1 extends Thread {
	
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("Runner1:" + i);
		}
	}
	
}
