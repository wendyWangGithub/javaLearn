package com.test.array;

public class StringArray {
	
	public static void main(String[] args) {
		//获取数据并打印
		String[] stringArray = defineAndAssignArray();
		printArray(stringArray);
		//将字符串转化为数组并打印
		String stringa = "a,b,c";
		changeToArray(stringa);
		printArray(changeToArray(stringa));
	}
	
	/**
	 * 声明、分配空间并赋值
	 */
	public static String[] defineAndAssignArray() {
		String[] s;
		s = new String[4];
		s[0] = "初一";
		s[1] = "初二";
		s[2] = "初三";
		s[3] = "初四";
		return s;
	}
	
	/**
	 * 将String类型转化为数组
	 */
	public static String[] changeToArray(String s){
		String[] stringArray;
		stringArray = s.split(",");
		return stringArray;
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
