
/**
 * @author wangwanru
 */
package com.test.thread;

public class Threadrun1 {
	//主线程先结束，分支线程才结束
	public static void main(String[] args) {
		Thread thread = new Thread(new Test());
		thread.setName("我的线程");
		System.out.println("开始执行线程！");
		thread.start();
		System.out.println("主线程已经结束！");
	}
}

class Test implements Runnable {
	
	public void run() {
		for (int i=0; i<1000; i++) {
			System.out.print(i);
		}
	}
}