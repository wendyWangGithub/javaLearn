package com.test.generic.genericScene;

/*
 * 使用接口时没有明确泛型的类型时，
 * 类名上要加上泛型的类型,
 * 类就变成了泛型类
 */
public class UseGenericInterface<T,E> implements GenericInterface<T,E>{

	public void method1(T t) {
		// TODO Auto-generated method stub
		
	}

	public void method2(E e) {
		// TODO Auto-generated method stub
		
	}
}


/*
 * 实现接口是，传递具体的泛型值
 * 类就不是泛型类了
 */
class UseGenericInterface2 implements GenericInterface<String,String>{

	public void method1(String t) {
		// TODO Auto-generated method stub
		
	}

	public void method2(String e) {
		// TODO Auto-generated method stub
		
	}
}