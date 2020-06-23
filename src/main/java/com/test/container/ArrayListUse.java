package com.test.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ArrayListUse {
	public static void main(String[] args) {
		
		List arrayListl = new ArrayList();
		Collection collection1 = new ArrayList();
		collection1.add(1);
		collection1.add("kaopu");
		System.out.println("值即有整型又有字符串型的ArrayList的值为：" + collection1);
		
		//整数集合
		List<Integer> inta = new ArrayList();
		inta.add(1);
		inta.add(4);
		inta.add(3);
		orderdata(inta);
		
		
		List<String> arrayliststring = new ArrayList();
		arrayliststring.add("初一");
		arrayliststring.add("初二");
		arrayliststring.add("初一");
		arrayliststring.add("初二");
		
		//打印数组中元素
		printArrayList3(arrayliststring);
		printArrayList(arrayliststring);
		printArrayList2(arrayliststring);
		
		//随机获取集合中的某个元素
		getRandomElement(arrayliststring);
	}
		//使用自带方法排序List里面的整数
		public static void orderdata(List<Integer> inta){
			Collections.sort(inta);
			System.out.println("排序后的数据为：" + inta);
			Collections.reverse(inta);
			System.out.println("排序后再反序的数据为：" + inta);
		}
		
	//使用iterator方法打印数组中的元素
		public static void printArrayList3(List<String> arrayliststring){
			Iterator<String> it = arrayliststring.iterator();
			while(it.hasNext()){
				String str = (String)it.next();
				System.out.println("用iterator打印出来排序前的值为：" + str);
			}
		}
	
	//使用for循环打印集合中的元素并排序
	public static void printArrayList(List<String> arrayliststring){
		int l = arrayliststring.size();
		System.out.println(l);
		for (int i=0; i<4; i++){
			if (arrayliststring.get(i) == "初一") {
				arrayliststring.remove(i);
				arrayliststring.add("初一");
			}else {
				arrayliststring.add("初二");
			}
			System.out.println(arrayliststring.get(i));
		}
	}
	
	//使用iterator方法打印数组中的元素
	public static void printArrayList2(List<String> arrayliststring){
		Iterator<String> it = arrayliststring.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println("用iterator打印出来的排序后的值为：" + str);
		}
	}
	
	//随机获取集合总的某个元素
	public static void getRandomElement(List<String> arrayliststring){
		int l =arrayliststring.size();
		int i = (int)(Math.random()*(l-1));
		System.out.println("i的值为：" + i);
		arrayliststring.remove(2);
		Iterator<String> it = arrayliststring.iterator();
		while(it.hasNext()){
			System.out.println("将索引为2的元素删除后，集合中的值为：" + it.next());
		}
	}
}
