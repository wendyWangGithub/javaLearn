package com.test.basic;

/**
 * 多态：在继承的基础上重写
 * 类：动物-猫或鸟-人
 */
class Anima {
	
	public String name;
	
	Anima(String name) {
		this.name = name;
	}

	public void enjoy() {
		System.out.print(name + "很开心！");
	}
}

class Cat extends Anima {
	private String eyesColor;
	
	Cat(String name, String color) {
		super(name);
		eyesColor = color;
	}
	
	public void enjoy() {
		System.out.println(name + "很开心！");
	}
}

class Bird extends Anima {
	
	private String featherColor;
	
	Bird(String name, String color) {
		super(name);
		featherColor = color;
	}
	
	public void enjoy() {
		System.out.println(name + "很开心！");
	}
}

class Lady {
	
	private String name;
	private Anima pet;
	//构造方法
	Lady(String name, Anima pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void myPetEnjoy() {
		pet.enjoy();
	}
}
//多态
public class PolymorphUse {
	
	public static void main(String[] args) {
		
		Cat c = new Cat("cat", "eyesColor-blue");
		Bird b = new Bird("bird", "featherColor-yellow");
		
		Lady lady1= new Lady("女士1", c);
		Lady lady2 = new Lady("女士2", b);

		lady1.myPetEnjoy();
		lady2.myPetEnjoy();
	}
}


