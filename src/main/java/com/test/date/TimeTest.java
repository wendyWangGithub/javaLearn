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
		Calendar ca = Calendar.getInstance();
		System.out.println("333333333:   " + ca.getTime());
		
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
	
	public static String formatString(String _beforeFormat, String format1, String format2) {
		String resultString = "";
		SimpleDateFormat format11 = new SimpleDateFormat(format1);
		SimpleDateFormat format22 = new SimpleDateFormat(format2);
		try {
			Date date = format11.parse(_beforeFormat);
			System.out.println("Date:" + date);
			resultString = format22.format(date);
			System.out.println("resultString:" + resultString);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return resultString;
	}
	
	
	public static String sfm(String beforFormat) {
		
		String resultString = "";
		
		DateFormat data1 = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat data2 = new SimpleDateFormat("yyyyMMdd");
		try {

			resultString = data1.format(data2.parse(beforFormat));
			System.out.printf(resultString);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return resultString;
	}
	
}