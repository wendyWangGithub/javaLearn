package com.test.object;

/**
 * 实现接口需要重写接口的所有方法(不管接口里的方法是不是抽象方法)
 * @author wangwanru
 *
 */
public class InterfaceUse implements InterfaceDefinition {
	
	public int length(){
		int a = 1;
		return a;
	}
	
	public int width(){
		int b = 2;
		return b;
	}
}
