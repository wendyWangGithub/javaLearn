package com.test.loop;

public class BreakAndContinueUse {

	//break-跳出循环
	public static void main(String[] args) {
		int j = 4;
		for (int i = 1; i < 10; i++) {
			if (i == j) {
				break;
			}
			System.out.print("i=" + i + ",");
		}
		numPrint();
	}
	
	//continue
	public static void numPrint() {
		int n = 3;
		for (int m = 1; m <= 5; m++) {
			if (m == n) {
				continue;
			}
			System.out.print("m=" + m + ',');
		}
		System.out.println("continue后的代码");
	}
}