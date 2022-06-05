package com.test.basic;

/**
 * 构造方法的使用
 */
public class ConstructionMethodUse {
	int i;
	int j;
	ConstructionMethodUse(int _i, int _j) {
		i = _i;
		j = _j;
	}
	
	public static void main(String[] args) {
		ConstructionMethodUse c = new ConstructionMethodUse(1,2);
		System.out.println("c.i的值为：" + c.i);
	}
}