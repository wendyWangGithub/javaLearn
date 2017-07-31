package com.test.loop;

public class WhileAndDoWhileUse {

	/**
	 * ��whileʵ�ִ�0��9����� 
	 */
	public static void main(String[] args) {
		int i = 0;
		while (i <=9) {
			System.out.print("i=" + i + ",");
			i++;
		}
		System.out.println();
		numPrint();
	}
	
	/**
	 * ��dowhileʵ�ִ�0��9�����
	 */
	public static int numPrint() {
		int j = 0;
		do {
			System.out.print("j=" + j + ",");
			j++;
		} while (j <= 9);
		return j;
	}
}

