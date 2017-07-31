package com.test.loop;

public class BreakAndContinueUse {

	/**
	 * ��breakʵ������1��3�����
	 */
	public static void main(String[] args) {
		int j = 4;
		for (int i = 1; i < 10; i++) {
			if (i == j) {
				break;
			}
			System.out.print("i=" + i + ",");
		}
		System.out.println();
		numPrint();
	}
	
	/**
	 * ��continuʵ������1��5���ų�����3�����
	 */
	public static void numPrint() {
		int n = 3;
		for (int m = 1; m <= 5; m++) {
			if (m == n) {
				continue;
			}
			System.out.print("m=" + m + ',');
		}
	}
}