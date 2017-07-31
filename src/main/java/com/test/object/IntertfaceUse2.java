package com.test.object;

interface Valueable {
	
	public double getMoney();
}

interface Protectable {
	
	public void beProtected();
}

interface A2 extends Protectable {
	
	void m();
}

abstract class Animal7 {
	
	private String name;
	
	abstract void enjoy();
}

public class IntertfaceUse2 extends Animal7 implements Valueable, Protectable {
	
	public double getMoney() {
		return 10000;
	}
	
	public void beProtected() {
		System.out.println("live in the room");
	}
	
	public void enjoy() {
		
	}
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		Valueable a = new IntertfaceUse2();
		a.getMoney();
		
		Protectable p = (Protectable)a;
		p.beProtected();
	}
}

class Hen implements A2 {
	
	public void m() {}
	
	public void beProtected() {}
}
