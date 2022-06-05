package com.test.string;

public class StringTest {
	
	public static void main(String[] args) {
		System.out.println("将String类型转化为数组");
		changeToArray();
		System.out.println("将String类型转换成long类型");
		changeToLong();
	}
	

	public static void changeToLong() {
		String s = "1234567";
		long l = Long.valueOf(s);
		System.out.println(l);
	}
	

	public static void changeToArray() {
		String testStringa = "1#1,滑雪新计划#hx_01,职业#hx_04,攀岩#hx_05";
		String[] testStringaArray = testStringa.split(",");
		for (int i=0; i<testStringaArray.length; i++){
			if(testStringaArray[i].contains("#")){
				String[] testStringaArraysub = testStringaArray[i].split("#");
				printArray(testStringaArraysub);
				//System.out.println("333333" + testStringaArraysub);
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
