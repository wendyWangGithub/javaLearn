package com.test.object;

abstract class Animal5 {
	
	private String name;
	
	Animal5(String name) {
		this.name = name;
	}
	
	public abstract void enjoy();
}

abstract class Cat5 extends Animal5 {
	
	private String eyesColor;
	
	Cat5(String n, String c) {
		super(n);
		eyesColor = c;
	}
	
	public abstract void enjoy();
}

class Dog5 extends Animal5 {
	
	private String furColor;
	
	Dog5(String n, String c) {
		super(n);
		furColor = c;
	}
		public void enjoy() {
			System.out.println("������......");
		}
	}

class Lady5 {
	
	private String name;
	private Animal5 pet;
	
	Lady5(String name, Animal5 pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

public class AbstractUse {
	public static void main(String[] args) {
		//Cat5 c = new Cat5("catname", "blue");
		//Animal5 c = new Dog5("dogname", "black");
		Dog5 d = new Dog5("dogname", "black");
		//Layd l1 = new Lady("l1", c);
		Lady5 l2 = new Lady5("l2", d);
		
		//l1.myPetEnjoy();
		l2.myPetEnjoy();
	}
}

