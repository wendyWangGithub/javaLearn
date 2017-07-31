package com.test.basic;

public class StaticUse {

	//private int sid;
	private static int sid;
	private String name;
	int id;
	
	StaticUse(String name) {
		this.name = name;
		id = sid++;
	}
	
	public void info() {
		System.out.println("My name is " + name + " No." + id);
	}
	
	public static void main(String[] args) {
		StaticUse.sid = 100;
		StaticUse mimi = new StaticUse("mimi");
		StaticUse pipi = new StaticUse("pipi");
		mimi.info();
		pipi.info();
	}
}

