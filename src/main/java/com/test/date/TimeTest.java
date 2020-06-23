/**
 * 
 */
/**
 * @author wangwanru
 *
 */
package com.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TimeTest {
	
	
	
	public static void main(String[] args) {
		
		String BeginTime = getCurrentDateTime("yyyy-MM-dd HH:mm:ss");//获取格式化时间
		System.out.println("开始时间为：" + BeginTime);
		
		getRunTime();//获取程序运行时间a
		
		formatString("2010-01-01 00:01:02", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHH");//把已知string变换成指定格式的String
		
		sfm("20170915");
	}
	
	 public static String getCurrentDateTime(String dateFormat) {
	        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
	        System.out.println("Date对象时间：" + new Date());
	        return sf.format(new Date());
	    }
	
	public static void getRunTime() {
		long startTime = System.currentTimeMillis(); //获取开始时间
		for (int i=0;i<100;i++) {
			System.out.print("测试的代码段   ");//测试的代码段
		}
		System.out.println();
		long endTime = System.currentTimeMillis(); //获取结束时间
	    System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
	}
	
	public static String formatString(String _beforeFormat, String bformat, String aformat) {
		String fString = "";
		SimpleDateFormat bsdf = new SimpleDateFormat(bformat);
		SimpleDateFormat asdf = new SimpleDateFormat(aformat);
		try {
			Date date = bsdf.parse(_beforeFormat);
			System.out.println("Date:" + date);
			fString = asdf.format(date);
			System.out.println("fString:" + fString);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return fString;
	}
	
	
	public static String sfm(String fm) {
		
		String dfr = "";
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat _df = new SimpleDateFormat("yyyyMMdd");
		try {
			
			dfr = df.format(_df.parse(fm));
			//System.out.printf(dfr);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return dfr;
	}
	
}