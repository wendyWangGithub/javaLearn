package com.test.basic;

public class ToStringOfObjectUse {
	
	public static void main(String[] args) {
		
		Dog d= new Dog();
		System.out.println("d=" + d);
	}
}

class Dog {
	public String toString() {
		return "I'm a cool dog!";
	}
}
