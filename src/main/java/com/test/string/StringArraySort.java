package com.test.string;

public class StringArraySort {
	
	public static void main(String[] args){
		String[] input = new String[]{"abc","abcd","dce","bcd"};
		arraySort(input);
	}
	
	public static void arraySort(String[] input){
		for(int i=0;i<input.length-1;i++){
			for (int j=0;j<input.length-1-i;j++){
				if(input[j].compareTo(input[j+1])<0){
					String temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		for(String key:input){
			System.out.println("input的值为:" + key);
		}
	}
	
	/**
	 * 
	 * @param first
	 * @param second
	 * @return boolean
	 * String 是引用类型，因为String是一个类
	 * null是一个可以成为任何引用类型的特殊符号
	 * 
	 */
	public static boolean isBiggerThan(String first,String second){
		if(first == null || second == null || "".equals(first) || "".equals(second)){
			System.out.println("字符串不能为空！");
			return false;
		}
		return true;
	}

}
