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
		Calendar calendar = Calendar.getInstance();
		System.out.println("Calendar时间:   " + calendar.getTime());
		
		String BeginTime = getCurrentDateTime("yyyy-MM-dd HH:mm:ss");
		System.out.println("格式化开始时间：" + BeginTime);
		
		getRunTime();//获取程序运行时间a
		
		formatTime("20170915");
	}
	
	 public static String getCurrentDateTime(String dateFormat) {
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
	        return simpleDateFormat.format(new Date());
	    }
	
	public static void getRunTime() {
		long startTime = System.currentTimeMillis(); //获取开始时间
		for (int i=0;i<100;i++) {
			int j = i;
			j++;
		}
		long endTime = System.currentTimeMillis(); //获取结束时间
	    System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
	}
	
	public static String formatTime(String beforFormat) {
		
		String resultString = "";
		
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat dateFormat2 = new SimpleDateFormat("yyyyMMdd");
		try {
			resultString = dateFormat1.format(dateFormat2.parse(beforFormat));
			System.out.printf("格式化后的时间：" + resultString);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return resultString;
	}
	
}