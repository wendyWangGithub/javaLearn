package com.test.loop;

public class ForUse {

	/**
	 * ��forѭ��ʵ��1��n�Ľ׳� 
	 */
	public static void main(String[] args) {
		long result = 0;
		long f = 1;
		for (int i = 1; i <= 10; i++) {
			f = f * i;
			result += f;
		}
		System.out.println("result=" + result);
		numAdd();
	}
	
	/**
	 * ��forѭ��ʵ�ִ�1��99֮�������ĺ�
	 * 1+3+...+99
	 */
	public static long numAdd() {
		long numSum = 0;
		for (int j = 1; j <= 99; j+=2) {
			numSum += j;
		}
		System.out.println("numSum=" + numSum);
		return numSum;
	}
}
