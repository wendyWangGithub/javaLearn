package com.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String args[]){
		try{
			getOffsetDate2("2010-01-01 00:01:02", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss","0000/01/00/00/00/10");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	
	public static String  getOffsetDate2(String toFormat, String bformat, String aformat, String offset) throws Exception
	{ 
		String fString2="";
		SimpleDateFormat bsdf = new SimpleDateFormat(bformat);
		Calendar ca = Calendar.getInstance();
		try {
			Date date = bsdf.parse(toFormat);
			ca.setTime(date);
			if(offset.contains("/")){
				String[] offSets = offset.split("/");
				
				ca.add(Calendar.YEAR, Integer.parseInt(offSets[0]));
				ca.add(Calendar.MONTH, Integer.parseInt(offSets[1]));
				ca.add(Calendar.DATE, Integer.parseInt(offSets[2]));
				if (offSets.length > 3) {
					ca.add(Calendar.HOUR, Integer.parseInt(offSets[3]));
					ca.add(Calendar.MINUTE, Integer.parseInt(offSets[4]));
					ca.add(Calendar.SECOND, Integer.parseInt(offSets[5]));
				}
			}else if(null!=offset){
				ca.add(Calendar.YEAR, Integer.parseInt(offset));
			}
		} catch (ParseException pe) {
			throw new Exception("Please check date format. And offset format must be 'yyyy-MM-dd' or 'yyyy-MM-dd HH:mm:ss'");
		}
		
		if(aformat.indexOf("sign")>-1){
			fString2=String.valueOf(ca.getTimeInMillis());
		}else{
			SimpleDateFormat asdf = new SimpleDateFormat(aformat);
			fString2 = asdf.format(ca.getTime());
			System.out.println("fString2:" + fString2);
		}
			return fString2;
	}

}
