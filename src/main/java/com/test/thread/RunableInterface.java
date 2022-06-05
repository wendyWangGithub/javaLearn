package com.test.thread;

public class RunableInterface {

	//两个线程同时执行
	public static void main(String[] args) {
		Runner2 r = new Runner2();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		System.out.println("线程t1开始执行");
		t1.start();
		System.out.println("线程t2开始执行");
		t2.start();
	}
}

class Runner2 implements Runnable {


	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("No." + i + "，");
		}
	}
}