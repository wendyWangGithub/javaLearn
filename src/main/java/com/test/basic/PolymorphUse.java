package com.test.basic;

class Animal2 {
	
	public String name;
	
	Animal2(String name) {
		this.name = name;
	}
	
	public void enjoy() {
		System.out.print("����......");
	}
}

class Cat4 extends Animal2 {
	private String eyesColor;
	
	Cat4(String n, String c) {
		super(n);
		eyesColor = c;
	}
	
	public void enjoy() {
		System.out.println("è����......");
	}
}

class Dog4 extends Animal2 {
	
	private String furcolor;
	
	Dog4(String n, String c) {
		super(n);
		furcolor = c;
	}
	
	public void enjoy() {
		System.out.println("������......");
	}
}

class Bird extends Animal2 {
	
	private String featherColor;
	
	Bird(String n, String f) {
		super(n);
		featherColor = f;
	}
	
	public void enjoy() {
		System.out.println("�����......");
	}
}

class Lady {
	
	private String name;
	private Animal2 pet;
	
	Lady(String name, Animal2 pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

public class PolymorphUse {
	
	public static void main(String[] args) {
		
		Cat4 c = new Cat4("catname", "blue");
		Dog4 d = new Dog4("dogname", "black");
		Bird b = new Bird("birdname", "yellow");
		
		Lady l1= new Lady("l1", c);
		Lady l2 = new Lady("l2", d);
		Lady l3 = new Lady("l3", b);
		
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
	}
}


