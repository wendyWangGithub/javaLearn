package com.test.object;

public class ThisUse {

	int i = 0;
	
	ThisUse (int i) {
		this.i = i;
	}
	
	ThisUse increament() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " + i);
	}
	
	public static void main (String[] args) {
		ThisUse tu = new ThisUse(100);
		tu.increament().increament().print();
	}
}

