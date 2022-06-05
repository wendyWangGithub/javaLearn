package com.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String args[])throws ParseException{
		System.out.print("没有偏移量afterFormatValue的值为:");
		DateFormatUse ("2022-01-01 00:01:02", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss");

		System.out.print("有偏移量afterFormatValue的值为:");
		try{
			getOffsetDate2("2010-01-01 00:01:02", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss","0000/01/00/00/00/10");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String  DateFormatUse(String toFormat, String beforeFormat, String afterFormat)throws ParseException{
		String afterFormatValue="";
		SimpleDateFormat beforeFormatValue = new SimpleDateFormat(beforeFormat);
		Calendar calendar = Calendar.getInstance();
		Date date = beforeFormatValue.parse(toFormat);
		calendar.setTime(date);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(afterFormat);
		afterFormatValue = simpleDateFormat.format(calendar.getTime());
		System.out.println( afterFormatValue);
		return afterFormatValue;
	}
	
	public static String  getOffsetDate2(String toFormat, String beforeFormat, String afterFormat, String offset) throws Exception
	{ 
		String afterFormatValue="";
		SimpleDateFormat beforeFormatValue = new SimpleDateFormat(beforeFormat);
		Calendar calendar = Calendar.getInstance();
		try {
			Date date = beforeFormatValue.parse(toFormat);
			calendar.setTime(date);
			if(offset.contains("/")){
				String[] offSets = offset.split("/");

				calendar.add(Calendar.YEAR, Integer.parseInt(offSets[0]));
				calendar.add(Calendar.MONTH, Integer.parseInt(offSets[1]));
				calendar.add(Calendar.DATE, Integer.parseInt(offSets[2]));
				if (offSets.length > 3) {
					calendar.add(Calendar.HOUR, Integer.parseInt(offSets[3]));
					calendar.add(Calendar.MINUTE, Integer.parseInt(offSets[4]));
					calendar.add(Calendar.SECOND, Integer.parseInt(offSets[5]));
				}
			}else if(null!=offset){
				calendar.add(Calendar.YEAR, Integer.parseInt(offset));
			}
		} catch (ParseException pe) {
			throw new Exception("Please check date format. And offset format must be 'yyyy-MM-dd' or 'yyyy-MM-dd HH:mm:ss'");
		}
		
		if(afterFormat.indexOf("sign")>-1){
			afterFormatValue=String.valueOf(calendar.getTimeInMillis());
		}else{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(afterFormat);
			afterFormatValue = simpleDateFormat.format(calendar.getTime());
			System.out.println( afterFormatValue);
		}
			return afterFormatValue;
	}
}
