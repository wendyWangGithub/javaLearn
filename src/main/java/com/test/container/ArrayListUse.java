package com.test.container;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListUse {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add("kaopu");
		ArrayList<String> as = new ArrayList();
		as.add("初一");
		as.add("初二");
		as.add("初一");
		as.add("初二");
		//System.out.println(as.get(2));
		int l = as.size();
		System.out.println(l);
		for (int i=0; i<4; i++){
			if (as.get(i) == "初一") {
				as.remove(i);
				as.add("初一");
			}else {
				as.add("初二");
			}
			System.out.println(as.get(i));
		}
		
	}

}
