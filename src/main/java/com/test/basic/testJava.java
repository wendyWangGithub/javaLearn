package com.test.basic;

public class testJava {
	
	public static void main(String args[]) {
		int sumValue;
		sumValue = addFunction(1, 2);
		System.out.println(sumValue);
	}
	
	public static int addFunction(int a, int b) {
		
		int sum;
		sum = a + b;
		return sum;
	}

}
