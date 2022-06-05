package com.test.loop;

public class LoopUse {

	/**
	 */
	public static void main(String[] args) {
		System.out.println("被3整除的数");
		devisibleBy3();
		System.out.println("奇数");
		primePrint();
		System.out.println("质数");
		primePrint2();
		System.out.println("质数2");
		primePrint3();
	}
	
	/**
	 */
	public static void devisibleBy3() {
		int j = 1;
		int count = 1;
		while(j < 101) {
			if(j % 3 == 0) {
				System.out.print("j=" + j + ",");
				count++;
			}
			if (count == 6) {
				break;
			}
			j++;
		}
		System.out.println();
	}
	
	/**
	 */
	public static void primePrint() {
		for (int k = 1; k < 6; k += 2){
			if (isSuShu(k)) {
				System.out.print("k=" + k + ",");
			}
		}
		System.out.println();
	}
	
	public static boolean isSuShu(int number) {
		boolean f = true;
		for (int m = 2; m < number; m++) {
			if (number % m == 0) {
				f = false;
				break;
			}
		}
		return f;
	}
	
	/**
	 */
	public static void primePrint2() {
		for (int n = 101; n < 200; n += 2){
			boolean f = true;
			for (int m = 2; m < n; m++) {
				if (n % m == 0) {
					f = false;
					break;
				}
			}
			if (f) {
				System.out.print("n=" + n + ",");
			}
		}
		System.out.println();
	}
	
	/**
	 */
	public static void primePrint3() {
		for (int n = 13; n < 20; n += 2){
			boolean f = true;
			for (int m = 2; m < n; m++) {
				if (n % m == 0) {
					f = false;
					break;
				}
			}
			if (!f) {
				continue;
			}
			System.out.print("n=" + n + ",");
		}
	}
}	

