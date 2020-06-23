package com.test.generic.genericScene;

public class UseGenericClass {
	
	public static void main(String[] args) {
		
		/*
		 * 泛型类的使用
		 */
		GenericClass gc = new GenericClass();
		gc.setT("ssss");
		Object g = gc.getT();//没有使用泛型参数，返回类型是Object
		
		//使用泛型参数
		GenericClass<String> gc1 = new GenericClass();
		gc1.setT("abc");
		String g1 = gc1.getT();
		
		
	}

}
