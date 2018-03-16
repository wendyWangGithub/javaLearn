package com.test.generic;

import java.util.LinkedList;
import java.util.List;

public class UseDog {
	
	public static void main(String[] args) {
		createdog(100, "black,white,gray");
	}
	public static void createdog(int height, String tailColor) {
		Dog dog = new Dog();
		dog.setHeight(height);
		String[] tailColors = tailColor.split(",");
		List<Dog> tailColorList = new LinkedList<Dog>();
		for (int i=0; i<tailColors.length; i++) {
			dog.setTailColor(tailColors[i]);
			tailColorList.add(dog);
		}
	}

}
