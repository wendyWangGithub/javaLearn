package com.test.basic;

public class TypeCastTest {
	
	public static void main(String[] args) {
		//数据类型转换
		//高精度数据类型向低精度数据类型转换，必然会有信息丢失，有可能失败
		int i = 123;
		byte b = 1;
		System.out.println("int加byte的值为：" + (i+b));
	}

}
