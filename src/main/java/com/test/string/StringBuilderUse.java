package com.test.string;

import org.testng.annotations.Test;


public class StringBuilderUse {
	
  /**
   * 频繁的更改字符串时，StringBuilder要比String快很多，因为String每次更改都要new一次
   * Author wangwanru
   */
	@Test
	public void useStringBuilder() {
		String text = "" ;  
        
        long beginTime = System.currentTimeMillis();  
        for ( int i= 0 ;i< 10000 ;i++)  
              text = text + i;  
        long endTime = System.currentTimeMillis();  
        System.out.println("执行时间：" +(endTime-beginTime));  

        StringBuilder sb = new StringBuilder ( "" );  
        beginTime = System.currentTimeMillis();  
        for ( int i= 0 ;i< 10000 ;i++)  
               sb.append(String.valueOf(i));  
        endTime = System.currentTimeMillis();  
        System.out.println("执行时间：" +(endTime-beginTime));   
	}
	
	/**
	 * append方法
	 * StringBuilder.append方法返回值是StringBuilder的一个引用
	 */
	@Test
	public void appenduse() {
		StringBuilder sb = new StringBuilder();
		sb.append(1);
		sb.append(2);
		System.out.println(sb);
	}
	
	
	
}
