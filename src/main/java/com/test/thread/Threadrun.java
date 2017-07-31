
/**
 * @author wangwanru
 *
 */
package com.test.thread;

public class Threadrun {
	
	public static void main(String[] args) {
		Thread t = new Thread(new Test());
		t.setName("我的线程");
		System.out.println("开始执行线程！");
		t.start();
		System.out.println("主线程已经结束！");
	}
}




class Test implements Runnable {
	
	public void run() {
		
		for (int i=0; i<1000; i++) {
			System.out.println(i);
		}
	}
	
}