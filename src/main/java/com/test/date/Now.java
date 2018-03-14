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


public class Now {
	
	
	
	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		//System.out.println("333333333:   " + ca.getTime());
		
		//把已知string变换成指定格式的String
		formatString("2010-01-01 00:01:02", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHH");
		
		sfm("20170915");
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