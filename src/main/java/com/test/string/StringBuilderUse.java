package com.test.string;

import org.testng.annotations.Test;


public class StringBuilderUse {
	
  /**
   * 频繁的更改字符串时，StringBuilder要比String快很多，因为String每次更改都要new一次
   * StringBuilder.append方法返回值是StringBuilder的一个引用
   * Author wangwanru
   * date：2018/01/05
   */
	@Test
	public void useStringBuilder() {
		//String
		String text = "" ;
        long beginTime = System.currentTimeMillis();  
        for ( int i= 0 ;i< 10000 ;i++)  
              text = text + i;  
        long endTime = System.currentTimeMillis();  
        System.out.println("String执行时间：" +(endTime-beginTime) );

		//StringBuilder
        StringBuilder sb = new StringBuilder ( "" );  
        beginTime = System.currentTimeMillis();  
        for ( int i= 0 ;i< 10000 ;i++)  
               sb.append(String.valueOf(i));  
        endTime = System.currentTimeMillis();  
        System.out.println("StringBuilder执行时间：" +(endTime-beginTime));
		//System.out.println("StringBuilder的值为：" +sb);
	}
}
