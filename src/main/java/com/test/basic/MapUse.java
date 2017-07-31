package com.test.basic;

import java.util.*;
import org.testng.annotations.Test;




public class MapUse {
	
	public static final Map<String, Integer> areaCode = new HashMap<String, Integer>();

	static {
		areaCode.put("北京市", 110000);
		areaCode.put("市辖区", 110100);
		areaCode.put("台湾省", 710000);
		areaCode.put("香港特别行政区", 810000);
		areaCode.put("澳门特别行政区", 820000);
	}
	
	@Test
	public void generate() {
		String id = "";
		StringBuilder generater = new StringBuilder();
		generater.append(this.actest());
		generater.append(rbtest());
		generater.append(rctest());
		generater.append(this.calcTrailingNumber(generater.toString().toCharArray()));
		id = generater.toString();
		if(id.length() < 18) {
		//	id = generate();
		}
		System.out.println("hhahahahahhahahahahahh");
		System.out.println(id);
		
	}
	
	@Test
	public int actest() {
		int index = (int) (Math.random() * areaCode.size());
		//System.out.println(index);
		//System.out.println(areaCode.size());
		Collection<Integer> values = areaCode.values();
		Iterator<Integer> it = values.iterator();
		int i = 0;
		int code = 0;
		while(i<index && it.hasNext()) {
			i++;
			code = it.next();
			//System.out.println("11111111111111111");
			System.out.println(code);
		}
		//System.out.println("2222222222222222");
		System.out.println(code);
		return code;
	}
	
	@Test
	public String rbtest() {
		Calendar birthday = Calendar.getInstance();
		//System.out.println(birthday);
		birthday.set(Calendar.YEAR, (int)(Math.random() * 60) + 1950);
		//System.out.println((int)(Math.random() * 60) + 1950);
		birthday.set(Calendar.MONTH, (int)(Math.random() * 12));
		birthday.set(Calendar.DATE, (int)(Math.random() * 31));
		
		StringBuilder builder = new StringBuilder();
		builder.append(birthday.get(Calendar.YEAR));
		long month = birthday.get(Calendar.MONTH) +1;
		if(month < 10) {
			builder.append("0");
		}
		builder.append(month);
		long date = birthday.get(Calendar.DATE);
		if(date < 10) {
			builder.append("0");
		}
		builder.append(date);
		//System.out.println(builder.toString());
		return builder.toString();
	}
	

	
	@Test
	public char calcTrailingNumber(char[] chars) {
		if (chars.length < 17) {
			return ' ';
		}
		int[] c = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		char[] r = {'1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2' };
		int[] n = new int[17];
		int result = 0;
		for (int i=0; i<n.length; i++) {
			n[i] = Integer.parseInt(chars[i] + "");
		}
		for (int i=0; i<n.length; i++) {
			result += c[i] * n[i];
		}
		return r[result % 11];
	}
	
	
	@Test
	public String rctest() {
		int code = (int) (Math.random() * 1000);
		//System.out.println("111111111111111111");
		//System.out.println(code);
		if(code < 10) {
			return "00" + code;
		} else if (code < 100) {
			return "0" + code;
		} else {
			return "" + code;
		}
	}
	
	
	/*
	@Test
	public void maptest() {
		Map<Integer, Integer> areaCode = new HashMap<Integer, Integer>();
		ac.put(1,1);
	}
	*/
	

}
