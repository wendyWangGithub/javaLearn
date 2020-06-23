package com.test.generic.genericScene;


/*
 * 泛型方法，平时用的比较少
 * 
 */
public class GenericMethod {

	/*
	 * 泛型方法的泛型是加在返回值前
	 */
	public <T,E> void method1(T t) {
		System.out.println("泛型方法的执行结果为：" + t);
	}
}
