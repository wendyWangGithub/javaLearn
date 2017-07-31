package com.test.object;


/**
 * 需要实现抽象类中的抽象方法（非抽象方法可以不用重写）
 * @author wangwanru
 *
 */
public class AbstractClassUse extends AbstractClassDefinition {
	

	public static void main(String args[]) {
		AbstractClassDefinition acd = new AbstractClassUse();
		//String.class 取得内存中该类型class对象的引用
		System.out.println(acd.getClass().getName());
		//new String().getClass() 通过实例对象取得在内存总该实际类型class对象的引用
		System.out.println(AbstractClassDefinition.class);
	}
	
	public int width() {
		int b = 2;
		return b;
	}

}
