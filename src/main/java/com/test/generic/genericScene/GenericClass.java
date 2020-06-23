package com.test.generic.genericScene;

/*
 * 泛型使用场景
 * 使用在类、接口、方法中
 * ArrayList就是类
 */
/*
 * 泛型类的定义
 * 泛型是加在类型名后面
 * <>里的T是泛型的形参名称（可以认为是一个Object)
 * T遵循java标识符规范即刻，T可以是abc，e等等
 * 可以定义多个泛型参数,中间用逗号隔开
 */
public class GenericClass<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
