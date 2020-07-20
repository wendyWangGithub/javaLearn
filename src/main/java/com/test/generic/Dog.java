package com.test.generic;

import java.util.List;

public class Dog {
	private int height;
	private String tailColor;
	private List<DogHobby> hobbyList;
	
	public Dog() {
		super();
	}

	public Dog(int height, String tailColor, List<DogHobby> hobbyList) {
		this.height = height;
		this.tailColor = tailColor;
		this.hobbyList = hobbyList;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getTailColor() {
		return tailColor;
	}

	public void setTailColor(String tailColor) {
		this.tailColor = tailColor;
	}

	public List<DogHobby> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<DogHobby> hobbyList) {
		this.hobbyList = hobbyList;
	}
}
