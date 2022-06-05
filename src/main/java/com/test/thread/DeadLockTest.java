package com.test.thread;

/**
 * 
 * @author Wangwanru
 * 代码分析
 * 
 * 1、同步执行和解锁条件（同步代码执行完即解锁）
 * 同步执行：Lock1和Lock2是同步执行的，所以是先输出Lock1 is running和Lock2 is running。 接着执行到Lock1 locked obj1和Lock2 locked obj2
 * 解锁条件：然后执行到Lock1 locked obj2,但是Lock2已经先locked obj2了，且Lock2的同步代码块还没有执行完（即synchronized花括号后面的代码），所以obj2的锁还没有释放，及Lock1去锁obj2时出现死锁
 * 
 * 2、因为多线程是同步执行的，故debug的结果（因为有断点）和直接run的结果是不同的。
 * 
 * 3、把Lock2中的第一个锁换成锁obj1，不会出现死锁
 * 若Lock2中先locked住obj1，就不会死锁，根据Console控制台中打印出来的lock顺序知道，Lock1先locked住obj1，这时候Locked2是locked不住obj1的，但是等Locked1再locked住obj2后Locked1
 * 的同步代码块就执行完了，此时，Locked2就可以Locked住obj1和obj2了。
 *
 */

public class DeadLockTest {
		public static String obj1 = "obj1";
		public static String obj2 = "obj2";
		
		public static void main(String[] args){
		Thread thread1 = new Thread(new Lock1());
		Thread thread2 = new Thread(new Lock2());

		//开启两个线程
		thread1.start();
		thread2.start();
		}

	static class Lock1 implements Runnable{
		//@Override
		public void run(){
			try{
				System.out.println("Lock1 is running");
				while(true){
					//synchronized是java的一个关键字,他可以保证被它修饰的方法或者代码块在任意时刻只能有一个线程执行。
					synchronized(DeadLockTest.obj1){
						System.out.println("Lock1 locked obj1");
						Thread.sleep(30000);
						synchronized(DeadLockTest.obj2){
							System.out.println("Lock1 locked obj2");
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	static class Lock2 implements Runnable{
		//@Override
		public void run(){
			try{
				System.out.println("Lock2 is running");
				while(true){
					synchronized(DeadLockTest.obj2){
						System.out.println("Lock2 locked obj2");
						Thread.sleep(30000);
						synchronized(DeadLockTest.obj1){
							System.out.println("Lock2 locked obj1");
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
