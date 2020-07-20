package com.test.generic;

import java.util.*;

/*
 * 泛型使用基础
 * Java中的泛型：类型限定。
 *本质：1、把对象/集合里面元素的类型推迟到创建集合的时候。2、类型参数化
 *历史：JDK1.5新特性
 *缺乏泛型的安全隐患：什么数据类型都能添加，取数据时，要对object类型进行强制转换，可能导致类型出错。
 *泛型的好处：1、限定类型，避免类型转换错误（不再需要进行强制类型转换），2、把运行期异常提前到编译期。3避免警告提示
 */
public class Genericbasic {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add(1);//编译不会报错
		
		ArrayList<String> lista = new ArrayList();
		lista.add("aaa");
		lista.add("bbbb");
		for(String l:lista) {
			System.out.println("String类型的泛型打印结果为:" + l);
		}
		System.out.println();
		//lista.add(1);//编译会报错
		
		/*
		 * 为什么要有泛型
		 * 把错误由运行期提前到编译器
		 * 泛型是学习的数组，因为数组里的元素都是一样的
		 * 
		 */
		ArrayList listb = new ArrayList();
		listb.add("aaa");
		listb.add(1);//编译不会报错,自动装箱
		String a = (String)listb.get(0);
		//String b = (String)listb.get(1);//编译不报错，执行会报错ClassCastException
		
		/*
		 * 泛型的格式
		 * <数据类型>只能使引用类型的数据
		 * 使用格式：数据类型<泛型的类型> 对象 = new 数据类型();
		 */
		ArrayList<String> listc = new ArrayList<String>();//完整的写法
		ArrayList<String> listd = new ArrayList();//右边可以不写泛型，编译器在1.7以后添加类型推断
		ArrayList liste = new ArrayList<String>();//泛型不写左边写右边，等于没有使用泛型
		liste.add(1);//不会报错
		liste.add("abc");
		for(Object obj:liste){
			System.out.println("泛型写右边等于没有使用泛型:" + obj);
		}
		System.out.println();
		/*
		 * 泛型类型为对象
		 */
		List<Dog> doglist = new ArrayList();
		Dog d1 = new Dog(10,"yellow",null);
		Dog d2 = new Dog(11,"white",null);
		doglist.add(d1);
		doglist.add(d2);
		for (Dog doggy:doglist) {
			System.out.println("对象类型的泛型打印结果为：" + doggy);
			//System.out.println("对象类型的泛型类中元素值：" + "狗高为：" + doggy.getHeight()+ ",狗尾巴颜色为:" + doggy.geTailColor());
		}
		System.out.println();
		
		
	}
}
