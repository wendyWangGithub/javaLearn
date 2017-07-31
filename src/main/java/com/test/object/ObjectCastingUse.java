package com.test.object;

class Animal {
	
	public String name;
	
	Animal(String name) {
		this.name = name;
	}
}

class Cat extends Animal {
	
	public String eyesColor;
	
	Cat(String n, String c) {
		super(n);
		eyesColor = c;
	}
}

class Dog3 extends Animal {
	
	public String furColor;
	
	Dog3(String n, String c) {
		super(n);
		furColor = c;
	}
}

public class ObjectCastingUse {
	
	public static void main(String args[]) {
		
		Animal a = new Animal("name");
		Cat c = new Cat("catname", "blue");
		Dog3 d = new Dog3("dogname", "black");
		
		ObjectCastingUse ocu = new ObjectCastingUse();
		ocu.f(a);
		ocu.f(c);
		ocu.f(d);
		
		System.out.println(a instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof Cat);
		
		a = new Dog3("bigyellow", "yellow");
		System.out.println(a.name);
		//System.out.println(a.furname); //!error
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog3);
		Dog3 d1 = (Dog3)a;
		System.out.println(d1.furColor);
		
		
	}
	
	public void f(Animal a) {
		
		System.out.println("name: " + a.name);
		
		if (a instanceof Cat) {
			Cat cat = (Cat)a;
			System.out.println(" " + cat.eyesColor + " eyes");
		}
		else if (a instanceof Dog3) {
			Dog3 dog = (Dog3)a;
			System.out.println(" " + dog.furColor + " fur");
		}
	}
}