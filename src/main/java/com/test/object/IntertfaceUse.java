package com.test.object;

interface Singer {
	
	public void sing();
	public void sleep();
	
}

interface Painter {
	
	public void paint();
	public void eat();
	
}

class Student6 implements Singer {
	
	private String name;
	
	Student6(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println("studying");
	}
	
	public String getName() {return name;}
	
	public void sing() {
		System.out.println("student is singing");
	}
	
	public void sleep() {
		System.out.println("student is sleeping");
	}
}

class Teacher6 implements Singer, Painter {
	
	private String name;
	
	public String getString() {
		return name;
	}
	
	Teacher6(String name) {this.name = name;}
	
	public void teach() {
		System.out.println("teaching");
	}
	
	public void sing() {
		System.out.println("teacher is singing");
	}
	
	public void sleep() {
		System.out.println("teacher is sleeping");
	}
	
	public void paint() {
		System.out.println("teacher is painting");
	}
	
	public void eat() {
		System.out.println("teacher is eating");
	}
	
}

public class IntertfaceUse {
	public static void main(String[] args) {
		Singer s1 = new Student6("le");
		s1.sing();
		s1.sleep();
		
		Singer s2 = new Teacher6("steven");
		s2.sing();
		s2.sleep();
		//f(s2);
		
		Painter p1 = (Painter)s2;
		p1.paint();
		p1.eat();
	}
	/*
	static void f(Singer s) {
		s.sing();
	}
	*/
}

