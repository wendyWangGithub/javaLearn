package com.test.basic;

import org.testng.annotations.Test;

public class MathUse {

	/**
	 * Math.random()返回带正号的double值，该值大于等于0.0且小于1.0
	 */
	@Test
	public void testMath() {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(Math.random());
	}
}
