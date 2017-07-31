package com.test.basic;

public class EqualsOfObjectUse {
	public static void main(String[] args) {
		Dog2 d1 = new Dog2(1, 2, 3);
		Dog2 d2 = new Dog2(1, 2, 3);
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}
	
}

class Dog2 {
	int color;
	int height, weight;
	
	public Dog2(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else{
			if(obj instanceof Dog2) {
				Dog2 d = (Dog2)obj;
				if(d.color == this.color && d.height == this.height && d.weight == this.weight) {
					return true;
				}
			}
		}
		return false;
	}
	
}
