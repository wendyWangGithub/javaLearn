package com.test.container;

import java.util.*;

public class HashMapTest {
	
	public static void main(String[] args){
		Map<String,String> hm=new HashMap();
		hm.put("key1", "value1");
		hm.put("key2", "value2");
		hm.put("key3", "value3");
		String value2 = hm.get("key2");
		System.out.println("value2的值为：" + value2);
		//遍历hashmap中的所有元素
		printHashMapValue(hm);
	}
	
	public static void printHashMapValue(Map<String,String> hm){
			Iterator ir = hm.entrySet().iterator();
			while(ir.hasNext()){
			System.out.println("hashmap遍历后的值为：" + ir.next());
		}
	}
}
