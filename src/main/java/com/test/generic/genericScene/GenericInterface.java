package com.test.generic.genericScene;

/*
 * 泛型接口
 * 接口里所有属性都是常量
 * 且都是public static final来修饰（接口里默认是这些来修饰）
 * 并且要明确给值
 * 
 * 接口里的所有方法都是用public abstract来修饰（接口里默认是public abstract来修饰）
 */
public interface GenericInterface<T,E> {
	
	//T t;//错误，因为接口里的属性都是常量,且为明确的值，泛型为不明确的值
	public abstract void method1(T t);
	public abstract void method2(E e);
	

}
