package com.test.list;

import java.util.*;

public class LinkedListTest {
	public static void main(String[] args) {
		//LinkedList-add方法
	      LinkedList list = new LinkedList();
	      list.add("Hello");
	      list.add(2);
	      System.out.println("LinkedList:" + list);

	    //LinkedList-addall方法
	      Collection collection = new ArrayList();
	      collection.add("One");
	      collection.add("Two");
	      list.addAll(collection);
	      System.out.println("LinkedList:" + list);
	      
	      List<Integer> a = new ArrayList();
	      a.add(1);
	      a.add(3);
	      a.add(3);
	      a.add(4);
	      System.out.println("a的值为: " + a);
	   }



}
