package com.test.generic;

public class Dog {
	private int height;
	private String tailColor;
	
	public Dog() {
		
	}
	
	public Dog(int height, String tailColor) {
		this.height = height;
		this.tailColor = tailColor;
	}
	
	public int getHeight() {
		return height;
	}
	public String geTailColor() {
		return tailColor;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setTailColor(String tailColor) {
		this.tailColor = tailColor;
	}
	

}
