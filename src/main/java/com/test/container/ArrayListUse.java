package com.test.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ArrayListUse {
	public static void main(String[] args) {
		
		Collection collection1 = new ArrayList();
		collection1.add(1);
		collection1.add("kaopu");
		System.out.println("值即有整型又有字符串型的ArrayList的值为：" + collection1);
		
		//整数集合排序
		List<Integer> inta = new ArrayList();
		inta.add(1);
		inta.add(4);
		inta.add(3);
		orderdata(inta);
		
		
		List<String> arrayliststring = new ArrayList();
		arrayliststring.add("初一");
		arrayliststring.add("初二");
		arrayliststring.add("初三");

		//打印数组中元素
		System.out.print("用iterator打印：");
		printArrayListIterator(arrayliststring);
		System.out.println();
		System.out.print("使用for循环打印：");
		printArrayListFor(arrayliststring);
		System.out.println();
		System.out.print("用iterator打印修改后的值：");
		printArrayListIterator(arrayliststring);
		System.out.println();
	}
		//使用自带方法排序List里面的整数
		public static void orderdata(List<Integer> inta){
			Collections.sort(inta);
			System.out.println("排序后的数据为：" + inta);
			Collections.reverse(inta);
			System.out.println("排序后再反序的数据为：" + inta);
		}
		

		public static void printArrayListIterator(List<String> arrayliststring){
			Iterator<String> it = arrayliststring.iterator();
			while(it.hasNext()){
				String str = (String)it.next();
				System.out.print(str + ",");
			}
		}

	public static void printArrayListFor(List<String> arrayliststring){
		int sizeValue = arrayliststring.size();
		for (int i=0; i<sizeValue; i++){
			if (arrayliststring.get(i) == "初一") {
				arrayliststring.remove(i);
				arrayliststring.add("初一");
			}else {
				arrayliststring.add("初二");
			}
			System.out.print(arrayliststring.get(i) + "，");
		}
	}
}
