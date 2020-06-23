package com.interviewquestion;

public class EquelsAnd {
	public static void main(String[] args){
		//"=="用于比较地址是否相等，使用场景基本数据类型。”equels"用于比较值是否相等。使用场景：对象类型
		String a = "abc";
		String b = new String("abc");
		String c = "abc";
		testString(a,b,c);
		System.out.println("addtest" );
	}
	
	public static void testString(String a,String b,String c){
		
		if(a == b){
			System.out.println("a和b的地址相等：a == b");
		}else{
			System.out.println("a和b的地址不行等：a != b");
		}
		
		if(a.equals(b)){
			System.out.println("a和b的值相等：a equals b");
		}else{
			System.out.println("a和b的值不相等：a not equals b");
		}
		
		if(a == c){
			System.out.println("a和c的地址相等：a == c");
		}else{
			System.out.println("a和c的地址不行等：a != c");
		}
		
		if(a.equals(c)){
			System.out.println("a和c的值相等：a equals c");
		}else{
			System.out.println("a和c的值不相等：a not equals c");
		}
		
	}
	
}
