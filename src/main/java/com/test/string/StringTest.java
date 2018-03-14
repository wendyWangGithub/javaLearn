package com.test.string;

public class StringTest {
	
	public static void main(String[] args) {
		changeToArray();
		changeToLong();
	}
	
	/**
	 * 将String类型转换成long类型
	 */
	public static void changeToLong() {
		String s = "1234567";
		long l = Long.valueOf(s);
		System.out.println(l);
	}
	
	/**
	 * 将String类型转化为数组
	 */
	public static void changeToArray() {
		String testStringa = "1#1,滑雪新计划#hx_01,滑雪计划一#hx_02,滑雪计划二#hx_03,职业#hx_04,攀岩#hx_05";
		String[] testStringaArray = testStringa.split(",");
		for (int i=0; i<testStringaArray.length; i++){
			if(testStringaArray[i].contains("#")){
				String[] testStringaArraysub = testStringaArray[i].split("#");
				printArray(testStringaArraysub);
			}
		}
	}
	
	/**
	 * 打印String类型数组
	 */
	public static void printArray(String[] s) {
		for (int i=0; i<s.length; i++){
			System.out.print(s[i] + ",");
		}
		System.out.println();
	}
}
