/**
 * 
 */
/**
 * @author wangwanru
 *
 */
package com.test.basic;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class IdCardsGenerator {
	
	public static final Map<String, Integer> areaCode = new HashMap<String, Integer>();
	
	static {
		IdCardsGenerator.areaCode.put("朝阳区", 110105);
		IdCardsGenerator.areaCode.put("澳门特别行政区", 820000);
	}
	
	public String generate() {
		String id = "";
		StringBuilder generater = new StringBuilder();
		generater.append(randomAreaCode());
		id = generater.toString();
		System.out.println(id + "111111111111");
		return id;
	}
	
	public int randomAreaCode() {
		int index = (int) (Math.random() * areaCode.size());
		Collection<Integer> values = areaCode.values();
		Iterator<Integer> it = values.iterator();
		int i = 0;
		int code = 0;
		while (i < index && it.hasNext()) {
			i++;
			code = it.next();
		}
		return code;
	}

}