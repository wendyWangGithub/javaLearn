package com.test.basic;

public class ConstructionMethodUse {
	int i;
	int j;
	ConstructionMethodUse(int _i, int _j) {
		i = _i;
		j = _j;
	}
	
	public static void main(String[] args) {
		ConstructionMethodUse c = new ConstructionMethodUse(1,2);
		System.out.println("c.i=" + c.i);
	}
}